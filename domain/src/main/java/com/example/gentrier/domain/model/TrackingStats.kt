package com.example.gentrier.domain.model

import java.time.Duration

/**
 * Stats related to a GPS tracking session
 */
data class TrackingStats(
    val distance: Float, // In meters
    val elapsedTime: Duration,
    val avgSpeed: Float, // In km/h
    val maxSpeed: Float, // In km/h
    val elevationGain: Double, // In meters
    val elevationLoss: Double, // In meters
    val pointCount: Int
) {
    // Formatted elapsed time string (HH:MM:SS)
    val formattedTime: String
        get() {
            val seconds = elapsedTime.seconds
            val hours = seconds / 3600
            val minutes = (seconds % 3600) / 60
            val secs = seconds % 60
            return String.format("%02d:%02d:%02d", hours, minutes, secs)
        }
        
    // Formatted distance string (in km with 2 decimal places)
    val formattedDistance: String
        get() = String.format("%.2f km", distance / 1000)
        
    // Formatted speeds
    val formattedAvgSpeed: String
        get() = String.format("%.1f km/h", avgSpeed)
        
    val formattedMaxSpeed: String
        get() = String.format("%.1f km/h", maxSpeed)
        
    // Formatted elevation
    val formattedElevationGain: String
        get() = String.format("+%.1f m", elevationGain)
        
    val formattedElevationLoss: String
        get() = String.format("-%.1f m", elevationLoss)
} 