package com.example.gentrier.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.gentrier.data.local.entity.ExampleEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {
    @Query("SELECT * FROM examples")
    fun getAll(): Flow<List<ExampleEntity>>

    @Query("SELECT * FROM examples WHERE id = :id")
    suspend fun getById(id: String): ExampleEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(example: ExampleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(examples: List<ExampleEntity>)

    @Update
    suspend fun update(example: ExampleEntity)

    @Delete
    suspend fun delete(example: ExampleEntity)

    @Query("DELETE FROM examples")
    suspend fun deleteAll()
} 