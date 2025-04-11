package com.example.gentrier.data.repository

import com.example.gentrier.data.local.dao.LocationPointDao
import com.example.gentrier.data.local.dao.SkiSessionDao
import com.example.gentrier.data.mapper.toDomain
import com.example.gentrier.data.mapper.toEntity
import com.example.gentrier.domain.model.LocationPoint
import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.repository.SkiSessionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.time.LocalDateTime
import java.util.UUID
import javax.inject.Inject

class SkiSessionRepositoryImpl @Inject constructor(
    private val skiSessionDao: SkiSessionDao,
    private val locationPointDao: LocationPointDao
) : SkiSessionRepository {

    override suspend fun startSession(): SkiSession {
        val newSession = SkiSession(
            id = UUID.randomUUID().toString(),
            startTime = LocalDateTime.now(),
            isActive = true
        )
        skiSessionDao.insertSession(newSession.toEntity())
        return newSession
    }

    override suspend fun endSession(sessionId: String): SkiSession? {
        val session = skiSessionDao.getSessionById(sessionId) ?: return null
        
        // Calculate session stats before ending
        val locationPoints = locationPointDao.getLocationPointsForSession(sessionId)
            .map { it.toDomain() }
        
        val updatedSession = session.copy(
            endTime = LocalDateTime.now(),
            isActive = false,
            maxSpeed = locationPoints.maxOfOrNull { it.speed } ?: 0f,
            avgSpeed = if (locationPoints.isNotEmpty()) locationPoints.map { it.speed }.average().toFloat() else 0f,
            // Calculate other metrics like distance, elevation gain/loss
            // This would typically involve more complex calculations with the location points
        )
        
        skiSessionDao.updateSession(updatedSession)
        
        return updatedSession.toDomain(locationPoints)
    }

    override suspend fun addLocationPoint(sessionId: String, locationPoint: LocationPoint) {
        locationPointDao.insertLocationPoint(locationPoint.toEntity(sessionId))
        
        // Update session statistics with the new location point
        val session = skiSessionDao.getSessionById(sessionId) ?: return
        val allPoints = locationPointDao.getLocationPointsForSession(sessionId)
            .map { it.toDomain() }
        
        // Update max speed if this point has a higher speed
        val maxSpeed = maxOf(session.maxSpeed, locationPoint.speed)
        
        // Recalculate average speed with all points
        val avgSpeed = if (allPoints.isNotEmpty()) {
            allPoints.map { it.speed }.average().toFloat()
        } else {
            0f
        }
        
        // Calculate distance, elevation gain/loss, etc.
        // This would involve more complex calculations
        
        skiSessionDao.updateSession(session.copy(
            maxSpeed = maxSpeed,
            avgSpeed = avgSpeed
            // Update other metrics as needed
        ))
    }

    override suspend fun getSession(sessionId: String): SkiSession? {
        return skiSessionDao.getSessionWithLocationPoints(sessionId)?.toDomain()
    }

    override fun getActiveSession(): Flow<SkiSession?> {
        return skiSessionDao.getActiveSession().map { entity ->
            entity?.let {
                val locationPoints = locationPointDao.getLocationPointsForSession(it.id)
                    .map { pointEntity -> pointEntity.toDomain() }
                it.toDomain(locationPoints)
            }
        }
    }

    override fun getAllSessions(): Flow<List<SkiSession>> {
        return skiSessionDao.getAllSessionsWithLocationPoints().map { sessions ->
            sessions.map { it.toDomain() }
        }
    }

    override suspend fun updateSession(session: SkiSession) {
        skiSessionDao.updateSession(session.toEntity())
    }

    override suspend fun deleteSession(sessionId: String) {
        skiSessionDao.deleteSession(sessionId)
    }
} 