package com.example.gentrier.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "examples")
data class ExampleEntity(
    @PrimaryKey
    val id: String,
    val name: String,
    val description: String,
    val createdAt: Long = System.currentTimeMillis()
) 