package com.example.gentrier.data.mapper

import com.example.gentrier.data.local.entity.LocationPointEntity
import com.example.gentrier.domain.model.LocationPoint

fun LocationPointEntity.toDomain(): LocationPoint {
    return LocationPoint(
        latitude = latitude,
        longitude = longitude,
        altitude = altitude,
        speed = speed,
        timestamp = timestamp
    )
}

fun LocationPoint.toEntity(sessionId: String): LocationPointEntity {
    return LocationPointEntity(
        sessionId = sessionId,
        latitude = latitude,
        longitude = longitude,
        altitude = altitude,
        speed = speed,
        timestamp = timestamp
    )
} 