package com.example.gentrier.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.gentrier.data.local.entity.LocationPointEntity

@Dao
interface LocationPointDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLocationPoint(locationPoint: LocationPointEntity): Long
    
    @Query("SELECT * FROM location_points WHERE sessionId = :sessionId ORDER BY timestamp ASC")
    suspend fun getLocationPointsForSession(sessionId: String): List<LocationPointEntity>
} 