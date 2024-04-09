package com.recruitmentapplication.domain.usecase

import com.recruitmentapplication.domain.extension.safeCall
import com.recruitmentapplication.domain.model.Event
import com.recruitmentapplication.domain.repository.EventRepository
import javax.inject.Inject

class GetEventUseCase @Inject constructor(
    private val eventRepository: EventRepository
) {

    suspend operator fun invoke(): Result<List<Event>> = safeCall {
        eventRepository.getEvents()
    }
}
