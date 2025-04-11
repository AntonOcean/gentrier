package com.example.gentrier.presentation.feature.session.active

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gentrier.domain.model.LocationPoint
import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.usecase.location.GetLocationUpdatesUseCase
import com.example.gentrier.domain.usecase.ski.EndSkiSessionUseCase
import com.example.gentrier.domain.usecase.ski.GetActiveSessionUseCase
import com.example.gentrier.domain.usecase.ski.StartSkiSessionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ActiveSessionViewModel @Inject constructor(
    private val startSkiSessionUseCase: StartSkiSessionUseCase,
    private val endSkiSessionUseCase: EndSkiSessionUseCase,
    private val getActiveSessionUseCase: GetActiveSessionUseCase,
    private val getLocationUpdatesUseCase: GetLocationUpdatesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(ActiveSessionState())
    val state: StateFlow<ActiveSessionState> = _state.asStateFlow()

    init {
        startSession()
        observeActiveSession()
        observeLocationUpdates()
    }

    private fun startSession() {
        viewModelScope.launch {
            try {
                val session = startSkiSessionUseCase()
                _state.update { it.copy(isLoading = false) }
            } catch (e: Exception) {
                _state.update {
                    it.copy(
                        isLoading = false,
                        error = e.message ?: "Unknown error occurred"
                    )
                }
            }
        }
    }

    fun endSession() {
        viewModelScope.launch {
            _state.update { it.copy(isEnding = true) }
            try {
                val session = state.value.session
                if (session != null) {
                    val endedSession = endSkiSessionUseCase(session.id)
                    _state.update {
                        it.copy(
                            isEnding = false,
                            sessionEnded = true,
                            sessionId = session.id
                        )
                    }
                }
            } catch (e: Exception) {
                _state.update {
                    it.copy(
                        isEnding = false,
                        error = e.message ?: "Unknown error occurred"
                    )
                }
            }
        }
    }

    fun clearError() {
        _state.update { it.copy(error = null) }
    }

    private fun observeActiveSession() {
        viewModelScope.launch {
            getActiveSessionUseCase().collect { session ->
                _state.update { it.copy(session = session) }
            }
        }
    }

    private fun observeLocationUpdates() {
        viewModelScope.launch {
            getLocationUpdatesUseCase().collect { locationPoint ->
                _state.update {
                    it.copy(currentLocation = locationPoint)
                }
            }
        }
    }
}

data class ActiveSessionState(
    val isLoading: Boolean = true,
    val isEnding: Boolean = false,
    val session: SkiSession? = null,
    val currentLocation: LocationPoint? = null,
    val error: String? = null,
    val sessionEnded: Boolean = false,
    val sessionId: String = ""
)