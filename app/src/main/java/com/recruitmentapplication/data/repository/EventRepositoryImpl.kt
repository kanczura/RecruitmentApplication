package com.recruitmentapplication.data.repository

import com.recruitmentapplication.data.network.EventApi
import com.recruitmentapplication.data.model.toDomain
import com.recruitmentapplication.domain.model.Event
import com.recruitmentapplication.domain.repository.EventRepository
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(
    private val eventApi: EventApi
) : EventRepository {

    override suspend fun getEvents(): List<Event> {
        return eventApi.getEvents().map {
            it.toDomain()
        }
    }
}
