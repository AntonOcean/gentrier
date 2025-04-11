package com.example.gentrier.domain.model

import java.time.LocalDateTime

data class LocationPoint(
    val latitude: Double,
    val longitude: Double,
    val altitude: Double, // in meters
    val speed: Float, // in km/h
    val timestamp: LocalDateTime
) 