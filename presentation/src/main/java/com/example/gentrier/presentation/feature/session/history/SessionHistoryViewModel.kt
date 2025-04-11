package com.example.gentrier.presentation.feature.session.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.usecase.ski.GetAllSessionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SessionHistoryViewModel @Inject constructor(
    private val getAllSessionsUseCase: GetAllSessionsUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(SessionHistoryState())
    val state: StateFlow<SessionHistoryState> = _state.asStateFlow()

    init {
        loadSessions()
    }

    private fun loadSessions() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }
            
            getAllSessionsUseCase()
                .catch { e ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            error = e.message ?: "Unknown error occurred"
                        )
                    }
                }
                .collect { sessions ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            sessions = sessions.filter { session -> !session.isActive }
                        )
                    }
                }
        }
    }

    fun clearError() {
        _state.update { it.copy(error = null) }
    }
}

data class SessionHistoryState(
    val isLoading: Boolean = false,
    val sessions: List<SkiSession> = emptyList(),
    val error: String? = null
) 