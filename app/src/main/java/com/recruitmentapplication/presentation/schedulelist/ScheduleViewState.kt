package com.recruitmentapplication.presentation.schedulelist

import com.recruitmentapplication.domain.model.Schedule

data class ScheduleViewState(
    val data: List<Schedule> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null,
)
