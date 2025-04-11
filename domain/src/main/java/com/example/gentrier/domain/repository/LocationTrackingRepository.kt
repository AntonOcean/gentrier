package com.example.gentrier.domain.repository

import com.example.gentrier.domain.model.LocationPoint
import com.example.gentrier.domain.model.TrackingStats
import kotlinx.coroutines.flow.Flow

interface LocationTrackingRepository {
    /**
     * Start location tracking with the foreground service
     */
    fun startTracking()
    
    /**
     * Stop location tracking
     */
    fun stopTracking()
    
    /**
     * Get a Flow of location updates
     */
    fun getLocationUpdates(): Flow<LocationPoint>
    
    /**
     * Check if tracking is currently active
     */
    fun isTracking(): Flow<Boolean>
    
    /**
     * Get a Flow of tracking statistics that updates with new location points
     */
    fun getTrackingStats(): Flow<TrackingStats>
} 