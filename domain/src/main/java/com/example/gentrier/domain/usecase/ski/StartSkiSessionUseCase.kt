package com.example.gentrier.domain.usecase.ski

import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.repository.LocationTrackingRepository
import com.example.gentrier.domain.repository.SkiSessionRepository
import javax.inject.Inject

class StartSkiSessionUseCase @Inject constructor(
    private val skiSessionRepository: SkiSessionRepository,
    private val locationTrackingRepository: LocationTrackingRepository
) {
    suspend operator fun invoke(): SkiSession {
        locationTrackingRepository.startTracking()
        return skiSessionRepository.startSession()
    }
} 