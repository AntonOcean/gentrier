package com.example.gentrier.data.service

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.location.Location
import android.os.BatteryManager
import android.os.Build
import android.os.IBinder
import android.os.Looper
import android.os.PowerManager
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import com.example.gentrier.data.utils.AdaptiveLocationRequestManager
import com.example.gentrier.data.utils.KalmanFilter
import com.example.gentrier.domain.model.LocationPoint
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@AndroidEntryPoint
class LocationTrackingService : Service() {
    companion object {
        private const val NOTIFICATION_ID = 1001
        private const val CHANNEL_ID = "ski_tracker_channel"
        
        // Update interval for reconfiguring location updates
        private const val LOCATION_CONFIG_UPDATE_INTERVAL = 30L // 30 seconds
        
        private val _isTracking = MutableStateFlow(false)
        val isTracking = _isTracking.asStateFlow()
        
        private val _locationUpdates = MutableStateFlow<LocationPoint?>(null)
        val locationUpdates = _locationUpdates.asStateFlow()
    }
    
    @Inject
    lateinit var mainActivityClass: Class<*>
    
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback
    private lateinit var powerManager: PowerManager
    private lateinit var batteryManager: BatteryManager
    
    private val serviceScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    
    // Kalman filter for smoothing location data
    private val kalmanFilter = KalmanFilter()
    
    // Adaptive location request manager
    private val locationRequestManager = AdaptiveLocationRequestManager()
    
    // Distance tracking variables
    private var lastLocation: Location? = null
    private var totalDistance = 0.0f
    private var currentSpeed = 0f
    
    // Wakeful processing
    private var wakeLock: PowerManager.WakeLock? = null
    
    override fun onCreate() {
        super.onCreate()
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        powerManager = getSystemService(Context.POWER_SERVICE) as PowerManager
        batteryManager = getSystemService(Context.BATTERY_SERVICE) as BatteryManager
        
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(result: LocationResult) {
                result.lastLocation?.let { location ->
                    processLocation(location)
                }
            }
        }
        
        // Acquire a partial wake lock to ensure processing continues
        wakeLock = powerManager.newWakeLock(
            PowerManager.PARTIAL_WAKE_LOCK,
            "Gentrier:LocationTrackingWakeLock"
        ).apply {
            acquire(TimeUnit.MINUTES.toMillis(30)) // Maximum 30 minutes, will be released on service stop
        }
    }
    
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        createNotificationChannel()
        
        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Ski Tracker")
            .setContentText("Tracking your location...")
            .setSmallIcon(android.R.drawable.ic_menu_mylocation)
            .setContentIntent(getMainActivityPendingIntent())
            .setOngoing(true)
            .build()
        
        startForeground(NOTIFICATION_ID, notification)
        
        // Reset the Kalman filter when starting tracking
        kalmanFilter.reset()
        
        // Reset tracking variables
        totalDistance = 0f
        currentSpeed = 0f
        lastLocation = null
        
        startLocationTracking()
        _isTracking.value = true
        
        return START_STICKY
    }
    
    override fun onDestroy() {
        super.onDestroy()
        stopLocationTracking()
        _isTracking.value = false
        wakeLock?.release()
    }
    
    override fun onBind(intent: Intent?): IBinder? = null
    
    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Ski Tracker"
            val descriptionText = "Location tracking for ski sessions"
            val importance = NotificationManager.IMPORTANCE_LOW
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
    
    private fun getMainActivityPendingIntent(): PendingIntent {
        val intent = Intent(this, mainActivityClass)
        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        return PendingIntent.getActivity(
            this,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }
    
    /**
     * Check if the device is currently charging
     */
    private val BatteryManager.isCharging: Boolean
        get() {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                this.isCharging
            } else {
                // For older API levels
                val batteryStatus = IntentFilter(Intent.ACTION_BATTERY_CHANGED).let { filter ->
                    applicationContext.registerReceiver(null, filter)
                }
                
                val status = batteryStatus?.getIntExtra(BatteryManager.EXTRA_STATUS, -1) ?: -1
                status == BatteryManager.BATTERY_STATUS_CHARGING ||
                        status == BatteryManager.BATTERY_STATUS_FULL
            }
        }
    
    private fun getCurrentLocationRequest(): LocationRequest {
        // Get battery level and charging state
        val batteryLevel = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)
        val isCharging = batteryManager.isCharging
        
        // Create an adaptive location request based on current conditions
        return locationRequestManager.createRequest(
            currentSpeed = currentSpeed,
            batteryLevel = batteryLevel,
            isCharging = isCharging
        )
    }
    
    private fun startLocationTracking() {
        try {
            // Check if we have location permissions
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // We don't have permissions, so we can't start tracking
                _isTracking.value = false
                stopSelf()
                return
            }
            
            // Get initial location request
            val locationRequest = getCurrentLocationRequest()
            
            fusedLocationClient.requestLocationUpdates(
                locationRequest,
                locationCallback,
                Looper.getMainLooper()
            )
            
            // Set up periodic reconfiguration of location updates based on conditions
            serviceScope.launch {
                while (_isTracking.value) {
                    // Update the location request periodically to adapt to current conditions
                    if (ActivityCompat.checkSelfPermission(
                            this@LocationTrackingService,
                            Manifest.permission.ACCESS_FINE_LOCATION
                        ) == PackageManager.PERMISSION_GRANTED
                    ) {
                        val updatedRequest = getCurrentLocationRequest()
                        fusedLocationClient.requestLocationUpdates(
                            updatedRequest,
                            locationCallback,
                            Looper.getMainLooper()
                        )
                    }
                    TimeUnit.SECONDS.sleep(LOCATION_CONFIG_UPDATE_INTERVAL)
                }
            }
            
        } catch (e: SecurityException) {
            // Handle permission issues
            e.printStackTrace()
            _isTracking.value = false
            stopSelf()
        }
    }
    
    private fun processLocation(location: Location) {
        // Calculate distance if we have a previous location
        if (lastLocation != null) {
            val distance = location.distanceTo(lastLocation!!)
            totalDistance += distance
        }
        lastLocation = location
        
        // Apply Kalman filter for smoother readings
        val filteredLocation = kalmanFilter.applyFilter(location)
        
        // Convert m/s to km/h
        currentSpeed = if (filteredLocation.hasSpeed()) filteredLocation.speed * 3.6f else 0f
        
        val locationPoint = LocationPoint(
            latitude = filteredLocation.latitude,
            longitude = filteredLocation.longitude,
            altitude = filteredLocation.altitude,
            speed = currentSpeed,
            timestamp = LocalDateTime.now()
        )
        
        _locationUpdates.value = locationPoint
        
        // Update notification with current speed
        updateNotification(currentSpeed)
    }
    
    private fun updateNotification(currentSpeed: Float) {
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("Ski Tracker")
            .setContentText("Speed: ${String.format("%.1f", currentSpeed)} km/h • Distance: ${String.format("%.2f", totalDistance / 1000)} km")
            .setSmallIcon(android.R.drawable.ic_menu_mylocation)
            .setContentIntent(getMainActivityPendingIntent())
            .setOngoing(true)
            .build()
        
        notificationManager.notify(NOTIFICATION_ID, notification)
    }
    
    private fun stopLocationTracking() {
        try {
            fusedLocationClient.removeLocationUpdates(locationCallback)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
} 