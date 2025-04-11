package com.example.gentrier.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.example.gentrier.data.local.entity.SkiSessionEntity
import com.example.gentrier.data.local.relation.SkiSessionWithLocationPoints
import kotlinx.coroutines.flow.Flow

@Dao
interface SkiSessionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSession(session: SkiSessionEntity): Long
    
    @Update
    suspend fun updateSession(session: SkiSessionEntity)
    
    @Query("SELECT * FROM ski_sessions WHERE id = :sessionId")
    suspend fun getSessionById(sessionId: String): SkiSessionEntity?
    
    @Query("SELECT * FROM ski_sessions WHERE isActive = 1 LIMIT 1")
    fun getActiveSession(): Flow<SkiSessionEntity?>
    
    @Query("SELECT * FROM ski_sessions ORDER BY startTime DESC")
    fun getAllSessions(): Flow<List<SkiSessionEntity>>
    
    @Transaction
    @Query("SELECT * FROM ski_sessions WHERE id = :sessionId")
    suspend fun getSessionWithLocationPoints(sessionId: String): SkiSessionWithLocationPoints?
    
    @Transaction
    @Query("SELECT * FROM ski_sessions ORDER BY startTime DESC")
    fun getAllSessionsWithLocationPoints(): Flow<List<SkiSessionWithLocationPoints>>
    
    @Query("DELETE FROM ski_sessions WHERE id = :sessionId")
    suspend fun deleteSession(sessionId: String)
} 