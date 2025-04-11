package com.example.gentrier.domain.usecase.ski

import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.repository.SkiSessionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllSessionsUseCase @Inject constructor(
    private val skiSessionRepository: SkiSessionRepository
) {
    operator fun invoke(): Flow<List<SkiSession>> {
        return skiSessionRepository.getAllSessions()
    }
} 