package com.example.gentrier.domain.repository

import com.example.gentrier.domain.model.LocationPoint
import com.example.gentrier.domain.model.SkiSession
import kotlinx.coroutines.flow.Flow

interface SkiSessionRepository {
    suspend fun startSession(): SkiSession
    suspend fun endSession(sessionId: String): SkiSession?
    suspend fun addLocationPoint(sessionId: String, locationPoint: LocationPoint)
    suspend fun getSession(sessionId: String): SkiSession?
    fun getActiveSession(): Flow<SkiSession?>
    fun getAllSessions(): Flow<List<SkiSession>>
    suspend fun updateSession(session: SkiSession)
    suspend fun deleteSession(sessionId: String)
} 