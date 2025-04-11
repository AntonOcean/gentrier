package com.example.gentrier.domain.usecase

import com.example.gentrier.domain.model.Example
import com.example.gentrier.domain.repository.ExampleRepository
import com.example.gentrier.domain.util.Resource
import javax.inject.Inject

/**
 * Use case for syncing examples with the remote API
 */
class SyncExamplesUseCase @Inject constructor(
    private val repository: ExampleRepository
) : NoParamsUseCase<Resource<List<Example>>>() {

    override suspend fun invoke(params: Unit): Resource<List<Example>> {
        return repository.syncExamples()
    }
} 