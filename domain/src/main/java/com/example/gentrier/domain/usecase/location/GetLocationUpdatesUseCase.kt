package com.example.gentrier.domain.usecase.location

import com.example.gentrier.domain.model.LocationPoint
import com.example.gentrier.domain.repository.LocationTrackingRepository
import com.example.gentrier.domain.repository.SkiSessionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetLocationUpdatesUseCase @Inject constructor(
    private val locationTrackingRepository: LocationTrackingRepository,
    private val skiSessionRepository: SkiSessionRepository
) {
    operator fun invoke(): Flow<LocationPoint> = flow {
        locationTrackingRepository.getLocationUpdates().collect { locationPoint ->
            // Store location point in active session if exists
            skiSessionRepository.getActiveSession().first()?.let { activeSession ->
                skiSessionRepository.addLocationPoint(activeSession.id, locationPoint)
            }
            emit(locationPoint)
        }
    }
} 