package com.recruitmentapplication.presentation.eventslist

import com.recruitmentapplication.domain.model.Event

data class EventViewState(
    val data: List<Event> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null,
)
