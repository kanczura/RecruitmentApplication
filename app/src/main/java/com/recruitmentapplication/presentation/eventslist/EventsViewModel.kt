package com.recruitmentapplication.presentation.eventslist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recruitmentapplication.domain.usecase.GetEventUseCase
import com.recruitmentapplication.presentation.DateTimeFormatter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EventsViewModel @Inject constructor(
    private val eventsUseCase: GetEventUseCase,
    private val dateTimeFormatter: DateTimeFormatter
) : ViewModel() {

    private val _uiState = MutableStateFlow(EventViewState(isLoading = true))
    val uiState = _uiState.asStateFlow()

    private val _event = MutableSharedFlow<Event>()
    val event = _event.asSharedFlow()

    init {
        viewModelScope.launch {
            eventsUseCase().fold(
                onSuccess = { events ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            data = events,
                        )
                    }
                },
                onFailure = { error ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = error.message,
                        )
                    }
                }
            )
        }
    }

    fun onEventClicked(event: com.recruitmentapplication.domain.model.Event) {
        viewModelScope.launch {
            _event.emit(Event.NavigateToVideo(event.videoUrl))
        }
    }
}
