package com.example.gentrier.domain.usecase.ski

import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.repository.LocationTrackingRepository
import com.example.gentrier.domain.repository.SkiSessionRepository
import javax.inject.Inject

class EndSkiSessionUseCase @Inject constructor(
    private val skiSessionRepository: SkiSessionRepository,
    private val locationTrackingRepository: LocationTrackingRepository
) {
    suspend operator fun invoke(sessionId: String): SkiSession? {
        locationTrackingRepository.stopTracking()
        return skiSessionRepository.endSession(sessionId)
    }
} 