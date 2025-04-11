package com.example.gentrier.presentation.feature.example

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gentrier.domain.model.Example
import com.example.gentrier.domain.usecase.GetAllExamplesUseCase
import com.example.gentrier.domain.usecase.SyncExamplesUseCase
import com.example.gentrier.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor(
    private val getAllExamplesUseCase: GetAllExamplesUseCase,
    private val syncExamplesUseCase: SyncExamplesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(ExampleState())
    val state: StateFlow<ExampleState> = _state.asStateFlow()

    init {
        loadExamples()
    }

    fun loadExamples() {
        viewModelScope.launch {
            getAllExamplesUseCase().collectLatest { examples ->
                _state.update { it.copy(examples = examples) }
            }
        }
    }

    fun syncExamples() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true, error = null) }
            
            when (val result = syncExamplesUseCase()) {
                is Resource.Success -> {
                    _state.update { it.copy(isLoading = false) }
                }
                is Resource.Error -> {
                    _state.update { 
                        it.copy(
                            isLoading = false,
                            error = result.message
                        )
                    }
                }
                else -> { /* Loading state already set */ }
            }
        }
    }
}

data class ExampleState(
    val examples: List<Example> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
) 