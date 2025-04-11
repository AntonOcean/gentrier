package com.example.gentrier.domain.model

import java.time.LocalDateTime

data class SkiSession(
    val id: String = "",
    val startTime: LocalDateTime,
    val endTime: LocalDateTime? = null,
    val distance: Float = 0f, // in meters
    val maxSpeed: Float = 0f, // in km/h
    val avgSpeed: Float = 0f, // in km/h
    val elevationGain: Float = 0f, // in meters
    val elevationLoss: Float = 0f, // in meters
    val locationPoints: List<LocationPoint> = emptyList(),
    val isActive: Boolean = true
) 