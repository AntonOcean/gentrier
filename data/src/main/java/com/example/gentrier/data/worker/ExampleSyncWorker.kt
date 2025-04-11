package com.example.gentrier.data.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.gentrier.domain.repository.ExampleRepository
import com.example.gentrier.domain.util.Resource
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class ExampleSyncWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val repository: ExampleRepository
) : CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        return when (val result = repository.syncExamples()) {
            is Resource.Success -> Result.success()
            is Resource.Error -> Result.failure()
            else -> Result.retry()
        }
    }

    companion object {
        const val WORK_NAME = "example_sync_worker"
    }
} 