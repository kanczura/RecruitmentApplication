package com.recruitmentapplication.presentation.eventslist

sealed class Event {

    data class NavigateToVideo(val videoUrl: String) : Event()

}
