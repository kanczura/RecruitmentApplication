package com.recruitmentapplication.presentation.schedulelist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.recruitmentapplication.domain.usecase.GetScheduleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScheduleListViewModel @Inject constructor(
    private val scheduleUseCase: GetScheduleUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<ScheduleViewState>(ScheduleViewState(isLoading = true))
    val state = _uiState.asStateFlow()

    private var job: Job? = null

    init {
        startUpdates()
    }

    private fun getSchedule() {
        viewModelScope.launch {
            scheduleUseCase().fold(
                onSuccess = { schedule ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            data = schedule
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

    private fun startUpdates() {
        stopUpdates()
        job = viewModelScope.launch {
            while (true) {
                getSchedule()
                delay(30000)
            }
        }
    }

    private fun stopUpdates() {
        job?.cancel()
        job = null
    }
}
