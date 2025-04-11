package com.example.gentrier.domain.usecase

import com.example.gentrier.domain.model.Example
import com.example.gentrier.domain.repository.ExampleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use case for getting all examples
 */
class GetAllExamplesUseCase @Inject constructor(
    private val repository: ExampleRepository
) : NoParamsUseCase<Flow<List<Example>>>() {

    override suspend fun invoke(params: Unit): Flow<List<Example>> {
        return repository.getAllExamples()
    }
} 