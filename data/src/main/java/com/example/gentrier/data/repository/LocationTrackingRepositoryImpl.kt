package com.example.gentrier.data.repository

import android.content.Context
import android.content.Intent
import com.example.gentrier.data.service.LocationTrackingService
import com.example.gentrier.domain.model.LocationPoint
import com.example.gentrier.domain.model.TrackingStats
import com.example.gentrier.domain.repository.LocationTrackingRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.Duration
import java.time.LocalDateTime
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocationTrackingRepositoryImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : LocationTrackingRepository {

    private val totalDistanceFlow = MutableStateFlow(0f) // In meters
    private val startTimeFlow = MutableStateFlow<LocalDateTime?>(null)
    private val locationPointsFlow = MutableStateFlow<List<LocationPoint>>(emptyList())
    
    override fun startTracking() {
        val intent = Intent(context, LocationTrackingService::class.java)
        context.startService(intent)
        startTimeFlow.value = LocalDateTime.now()
        
        // Reset stats when starting new tracking session
        totalDistanceFlow.value = 0f
        locationPointsFlow.value = emptyList()
    }

    override fun stopTracking() {
        val intent = Intent(context, LocationTrackingService::class.java)
        context.stopService(intent)
        startTimeFlow.value = null
    }

    override fun getLocationUpdates(): Flow<LocationPoint> {
        return LocationTrackingService.locationUpdates
            .filter { it != null }
            .map { it!! }
            .map { locationPoint ->
                // Add point to our list for stats calculation
                val currentPoints = locationPointsFlow.value.toMutableList()
                currentPoints.add(locationPoint)
                locationPointsFlow.value = currentPoints
                
                // Update total distance if we have at least 2 points
                if (currentPoints.size >= 2) {
                    val lastPoint = currentPoints[currentPoints.size - 2]
                    val distance = calculateDistance(
                        lastPoint.latitude, lastPoint.longitude,
                        locationPoint.latitude, locationPoint.longitude
                    )
                    totalDistanceFlow.value += distance
                }
                
                locationPoint
            }
    }

    override fun isTracking(): Flow<Boolean> {
        return LocationTrackingService.isTracking
    }
    
    override fun getTrackingStats(): Flow<TrackingStats> {
        return MutableStateFlow(1) // Dummy flow to trigger updates
            .map {
                val points = locationPointsFlow.value
                val startTime = startTimeFlow.value ?: LocalDateTime.now()
                val elapsedTime = Duration.between(startTime, LocalDateTime.now())
                val distance = totalDistanceFlow.value
                
                // Calculate average speed (km/h)
                val avgSpeed = if (elapsedTime.seconds > 0) {
                    // Convert m/s to km/h: (distance_meters / seconds) * 3.6
                    (distance / elapsedTime.seconds) * 3.6f
                } else {
                    0f
                }
                
                // Get max speed from points
                val maxSpeed = points.maxOfOrNull { it.speed } ?: 0f
                
                // Calculate elevation gain/loss
                var elevationGain = 0.0
                var elevationLoss = 0.0
                
                if (points.size >= 2) {
                    for (i in 1 until points.size) {
                        val elevationDiff = points[i].altitude - points[i-1].altitude
                        if (elevationDiff > 0) {
                            elevationGain += elevationDiff
                        } else {
                            elevationLoss += -elevationDiff
                        }
                    }
                }
                
                TrackingStats(
                    distance = distance,
                    elapsedTime = elapsedTime,
                    avgSpeed = avgSpeed,
                    maxSpeed = maxSpeed,
                    elevationGain = elevationGain,
                    elevationLoss = elevationLoss,
                    pointCount = points.size
                )
            }
    }
    
    /**
     * Calculate distance between two points using the Haversine formula
     * Returns distance in meters
     */
    private fun calculateDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Float {
        val earthRadius = 6371000.0 // meters
        
        val dLat = Math.toRadians(lat2 - lat1)
        val dLon = Math.toRadians(lon2 - lon1)
        
        val a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                Math.sin(dLon/2) * Math.sin(dLon/2)
        
        val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a))
        
        return (earthRadius * c).toFloat()
    }
} 