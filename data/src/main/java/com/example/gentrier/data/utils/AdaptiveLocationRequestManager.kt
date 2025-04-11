package com.example.gentrier.data.utils

import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.Priority

/**
 * Manages location requests that adapt to different conditions like
 * battery level, user speed, and activity type.
 */
class AdaptiveLocationRequestManager {
    
    companion object {
        // Default intervals
        private const val NORMAL_UPDATE_INTERVAL = 1000L // 1 second
        private const val NORMAL_FASTEST_INTERVAL = 500L // 0.5 seconds
        
        // Battery saving intervals
        private const val BATTERY_SAVING_UPDATE_INTERVAL = 3000L // 3 seconds
        private const val BATTERY_SAVING_FASTEST_INTERVAL = 1500L // 1.5 seconds
        
        // High accuracy intervals for high-speed movement
        private const val HIGH_ACCURACY_UPDATE_INTERVAL = 500L // 0.5 seconds
        private const val HIGH_ACCURACY_FASTEST_INTERVAL = 250L // 0.25 seconds
        
        // Stationary or low movement intervals
        private const val STATIONARY_UPDATE_INTERVAL = 10000L // 10 seconds
        private const val STATIONARY_FASTEST_INTERVAL = 5000L // 5 seconds
        
        // Default thresholds
        private const val DEFAULT_HIGH_SPEED_THRESHOLD = 15.0f // km/h
        private const val DEFAULT_LOW_BATTERY_THRESHOLD = 20 // %
        private const val DEFAULT_STATIONARY_SPEED_THRESHOLD = 2.0f // km/h
    }
    
    // Configurable thresholds
    var highSpeedThreshold = DEFAULT_HIGH_SPEED_THRESHOLD
    var lowBatteryThreshold = DEFAULT_LOW_BATTERY_THRESHOLD
    var stationarySpeedThreshold = DEFAULT_STATIONARY_SPEED_THRESHOLD
    
    /**
     * Creates a location request adapted to the current conditions
     * 
     * @param currentSpeed Current speed in km/h
     * @param batteryLevel Current battery level (0-100)
     * @param isCharging Whether the device is currently charging
     * @return LocationRequest configured for the conditions
     */
    fun createRequest(currentSpeed: Float, batteryLevel: Int, isCharging: Boolean = false): LocationRequest {
        val isLowBattery = batteryLevel <= lowBatteryThreshold && !isCharging
        val isHighSpeed = currentSpeed >= highSpeedThreshold
        val isStationary = currentSpeed <= stationarySpeedThreshold
        
        // Choose appropriate intervals based on conditions
        val updateInterval = when {
            isHighSpeed -> HIGH_ACCURACY_UPDATE_INTERVAL
            isStationary -> STATIONARY_UPDATE_INTERVAL
            isLowBattery -> BATTERY_SAVING_UPDATE_INTERVAL
            else -> NORMAL_UPDATE_INTERVAL
        }
        
        val fastestInterval = when {
            isHighSpeed -> HIGH_ACCURACY_FASTEST_INTERVAL
            isStationary -> STATIONARY_FASTEST_INTERVAL
            isLowBattery -> BATTERY_SAVING_FASTEST_INTERVAL
            else -> NORMAL_FASTEST_INTERVAL
        }
        
        val priority = when {
            isHighSpeed -> Priority.PRIORITY_HIGH_ACCURACY
            isStationary -> Priority.PRIORITY_BALANCED_POWER_ACCURACY
            isLowBattery -> Priority.PRIORITY_BALANCED_POWER_ACCURACY
            else -> Priority.PRIORITY_HIGH_ACCURACY
        }
        
        return LocationRequest.Builder(
            priority,
            updateInterval
        )
            .setMinUpdateIntervalMillis(fastestInterval)
            .setMaxUpdateDelayMillis(updateInterval * 2)
            .build()
    }
} 