package com.example.gentrier.data.mapper

import com.example.gentrier.data.local.entity.ExampleEntity
import com.example.gentrier.domain.model.Example

/**
 * Extension function to convert domain model to data layer entity
 */
fun Example.toEntity(): ExampleEntity {
    return ExampleEntity(
        id = id,
        name = name,
        description = description,
        createdAt = createdAt
    )
}

/**
 * Extension function to convert data layer entity to domain model
 */
fun ExampleEntity.toDomain(): Example {
    return Example(
        id = id,
        name = name,
        description = description,
        createdAt = createdAt
    )
} 