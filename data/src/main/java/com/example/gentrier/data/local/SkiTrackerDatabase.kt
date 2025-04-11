package com.example.gentrier.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.gentrier.data.local.converter.DateTimeConverters
import com.example.gentrier.data.local.dao.LocationPointDao
import com.example.gentrier.data.local.dao.SkiSessionDao
import com.example.gentrier.data.local.entity.LocationPointEntity
import com.example.gentrier.data.local.entity.SkiSessionEntity

@Database(
    entities = [
        SkiSessionEntity::class,
        LocationPointEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateTimeConverters::class)
abstract class SkiTrackerDatabase : RoomDatabase() {
    abstract fun skiSessionDao(): SkiSessionDao
    abstract fun locationPointDao(): LocationPointDao
} 