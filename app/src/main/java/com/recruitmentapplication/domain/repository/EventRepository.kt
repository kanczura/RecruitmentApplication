package com.recruitmentapplication.domain.repository

import com.recruitmentapplication.domain.model.Event

interface EventRepository {

    suspend fun getEvents(): List<Event>
}
