package com.example.gentrier.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "ski_sessions")
data class SkiSessionEntity(
    @PrimaryKey
    val id: String,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime? = null,
    val distance: Float = 0f,
    val maxSpeed: Float = 0f,
    val avgSpeed: Float = 0f,
    val elevationGain: Float = 0f,
    val elevationLoss: Float = 0f,
    val isActive: Boolean = true
) 