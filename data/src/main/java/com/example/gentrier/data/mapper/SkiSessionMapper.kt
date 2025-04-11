package com.example.gentrier.data.mapper

import com.example.gentrier.data.local.entity.SkiSessionEntity
import com.example.gentrier.data.local.relation.SkiSessionWithLocationPoints
import com.example.gentrier.domain.model.SkiSession

fun SkiSessionEntity.toDomain(locationPoints: List<com.example.gentrier.domain.model.LocationPoint> = emptyList()): SkiSession {
    return SkiSession(
        id = id,
        startTime = startTime,
        endTime = endTime,
        distance = distance,
        maxSpeed = maxSpeed,
        avgSpeed = avgSpeed,
        elevationGain = elevationGain,
        elevationLoss = elevationLoss,
        locationPoints = locationPoints,
        isActive = isActive
    )
}

fun SkiSession.toEntity(): SkiSessionEntity {
    return SkiSessionEntity(
        id = id,
        startTime = startTime,
        endTime = endTime,
        distance = distance,
        maxSpeed = maxSpeed,
        avgSpeed = avgSpeed,
        elevationGain = elevationGain,
        elevationLoss = elevationLoss,
        isActive = isActive
    )
}

fun SkiSessionWithLocationPoints.toDomain(): SkiSession {
    return SkiSession(
        id = session.id,
        startTime = session.startTime,
        endTime = session.endTime,
        distance = session.distance,
        maxSpeed = session.maxSpeed,
        avgSpeed = session.avgSpeed,
        elevationGain = session.elevationGain,
        elevationLoss = session.elevationLoss,
        locationPoints = locationPoints.map { it.toDomain() },
        isActive = session.isActive
    )
} 