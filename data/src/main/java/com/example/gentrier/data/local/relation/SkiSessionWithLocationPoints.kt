package com.example.gentrier.data.local.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.gentrier.data.local.entity.LocationPointEntity
import com.example.gentrier.data.local.entity.SkiSessionEntity

data class SkiSessionWithLocationPoints(
    @Embedded val session: SkiSessionEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "sessionId"
    )
    val locationPoints: List<LocationPointEntity>
) 