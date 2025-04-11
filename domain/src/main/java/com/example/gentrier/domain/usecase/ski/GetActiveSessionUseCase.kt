package com.example.gentrier.domain.usecase.ski

import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.repository.SkiSessionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetActiveSessionUseCase @Inject constructor(
    private val skiSessionRepository: SkiSessionRepository
) {
    operator fun invoke(): Flow<SkiSession?> {
        return skiSessionRepository.getActiveSession()
    }
} 