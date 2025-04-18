package com.example.gentrier.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.gentrier.data.local.dao.ExampleDao
import com.example.gentrier.data.local.entity.ExampleEntity

@Database(
    entities = [ExampleEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
} 