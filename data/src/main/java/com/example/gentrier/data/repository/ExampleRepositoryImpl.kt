package com.example.gentrier.data.repository

import com.example.gentrier.data.local.dao.ExampleDao
import com.example.gentrier.data.mapper.toEntity
import com.example.gentrier.data.mapper.toDomain
import com.example.gentrier.data.remote.ApiService
import com.example.gentrier.domain.model.Example
import com.example.gentrier.domain.repository.ExampleRepository
import com.example.gentrier.domain.util.Resource
import com.example.gentrier.domain.util.safeCall
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleRepositoryImpl @Inject constructor(
    private val exampleDao: ExampleDao,
    private val apiService: ApiService
) : ExampleRepository {

    override fun getAllExamples(): Flow<List<Example>> {
        return exampleDao.getAll().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun getExampleById(id: String): Example? {
        return exampleDao.getById(id)?.toDomain()
    }

    override suspend fun addExample(example: Example) {
        exampleDao.insert(example.toEntity())
    }

    override suspend fun updateExample(example: Example) {
        exampleDao.update(example.toEntity())
    }

    override suspend fun deleteExample(example: Example) {
        exampleDao.delete(example.toEntity())
    }

    override suspend fun syncExamples(): Resource<List<Example>> {
        return safeCall {
            // Call API
            val response = apiService.getExample()
            
            // Map to domain model and save to database
            val example = Example(
                id = response.id,
                name = response.name,
                description = response.description,
                createdAt = System.currentTimeMillis()
            )
            
            // Save to database
            exampleDao.insert(example.toEntity())
            
            // Return domain model list
            listOf(example)
        }
    }
} 