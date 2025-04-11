package com.example.gentrier.data.utils

import android.location.Location

/**
 * Implements a simple Kalman filter for GPS location data smoothing.
 * This filter reduces noise from GPS readings, resulting in smoother location tracking.
 */
class KalmanFilter {
    // Filter parameters
    private var kalmanGain = 0.0f
    private var estimatedErrorCovariance = 1.0f
    private var processNoiseCovariance = 0.001f // Lower values = more smoothing but slower response
    private var observationNoiseCovariance = 0.01f // Higher values = more smoothing
    
    // Last known values
    private var lastLatitude: Double? = null
    private var lastLongitude: Double? = null
    private var lastAltitude: Double? = null
    private var lastSpeed: Float? = null
    
    /**
     * Apply Kalman filter to the given location
     * @param location Raw location from GPS
     * @return Filtered location with smoothed values
     */
    fun applyFilter(location: Location): Location {
        val filteredLocation = Location(location)
        
        // Initialize last values if they're null
        if (lastLatitude == null) lastLatitude = location.latitude
        if (lastLongitude == null) lastLongitude = location.longitude
        if (lastAltitude == null) lastAltitude = location.altitude
        if (lastSpeed == null) lastSpeed = if (location.hasSpeed()) location.speed else 0f
        
        // Calculate Kalman gain
        estimatedErrorCovariance += processNoiseCovariance
        kalmanGain = estimatedErrorCovariance / (estimatedErrorCovariance + observationNoiseCovariance)
        
        // Apply filter to position
        val filteredLatitude = lastLatitude!! + kalmanGain * (location.latitude - lastLatitude!!)
        val filteredLongitude = lastLongitude!! + kalmanGain * (location.longitude - lastLongitude!!)
        val filteredAltitude = lastAltitude!! + kalmanGain * (location.altitude - lastAltitude!!)
        
        // Apply filter to speed if available
        val currentSpeed = if (location.hasSpeed()) location.speed else 0f
        val filteredSpeed = lastSpeed!! + kalmanGain * (currentSpeed - lastSpeed!!)
        
        // Update estimated error covariance
        estimatedErrorCovariance = (1 - kalmanGain) * estimatedErrorCovariance
        
        // Set filtered values to the new location
        filteredLocation.latitude = filteredLatitude
        filteredLocation.longitude = filteredLongitude
        filteredLocation.altitude = filteredAltitude
        if (location.hasSpeed()) {
            filteredLocation.speed = filteredSpeed
        }
        
        // Update last values for next iteration
        lastLatitude = filteredLatitude
        lastLongitude = filteredLongitude
        lastAltitude = filteredAltitude
        lastSpeed = filteredSpeed
        
        return filteredLocation
    }
    
    /**
     * Reset the filter state
     */
    fun reset() {
        lastLatitude = null
        lastLongitude = null
        lastAltitude = null
        lastSpeed = null
        estimatedErrorCovariance = 1.0f
    }
    
    /**
     * Configure the filter parameters
     * @param processNoise How much to trust the model prediction (lower = smoother)
     * @param observationNoise How much to trust the observations (higher = smoother)
     */
    fun configure(processNoise: Float, observationNoise: Float) {
        processNoiseCovariance = processNoise
        observationNoiseCovariance = observationNoise
    }
    
    /**
     * Get last known filtered speed in m/s
     */
    fun getLastSpeed(): Float? = lastSpeed
} 