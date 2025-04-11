package com.example.gentrier.domain.repository

import com.example.gentrier.domain.model.Example
import com.example.gentrier.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface ExampleRepository : BaseRepository {
    fun getAllExamples(): Flow<List<Example>>
    suspend fun getExampleById(id: String): Example?
    suspend fun addExample(example: Example)
    suspend fun updateExample(example: Example)
    suspend fun deleteExample(example: Example)
    suspend fun syncExamples(): Resource<List<Example>>
} 