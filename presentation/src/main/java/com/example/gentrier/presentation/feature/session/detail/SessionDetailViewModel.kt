package com.example.gentrier.presentation.feature.session.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gentrier.domain.model.SkiSession
import com.example.gentrier.domain.repository.SkiSessionRepository
import com.example.gentrier.presentation.navigation.Screen
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SessionDetailViewModel @Inject constructor(
    private val skiSessionRepository: SkiSessionRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = MutableStateFlow(SessionDetailState())
    val state: StateFlow<SessionDetailState> = _state.asStateFlow()
    
    private val sessionId: String = checkNotNull(savedStateHandle[Screen.SessionDetail.SESSION_ID_ARG])

    init {
        loadSession()
    }

    private fun loadSession() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }
            
            try {
                val session = skiSessionRepository.getSession(sessionId)
                
                if (session != null) {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            session = session
                        )
                    }
                } else {
                    _state.update {
                        it.copy(
                            isLoading = false,
                            error = "Session not found"
                        )
                    }
                }
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

    fun deleteSession() {
        viewModelScope.launch {
            _state.update { it.copy(isDeleting = true) }
            
            try {
                skiSessionRepository.deleteSession(sessionId)
                _state.update {
                    it.copy(
                        isDeleting = false,
                        isDeleted = true
                    )
                }
            } catch (e: Exception) {
                _state.update {
                    it.copy(
                        isDeleting = false,
                        error = e.message ?: "Unknown error occurred"
                    )
                }
            }
        }
    }

    fun clearError() {
        _state.update { it.copy(error = null) }
    }
}

data class SessionDetailState(
    val isLoading: Boolean = false,
    val isDeleting: Boolean = false,
    val isDeleted: Boolean = false,
    val session: SkiSession? = null,
    val error: String? = null
) 