package com.recruitmentapplication.domain.usecase

import com.recruitmentapplication.domain.extension.safeCall
import com.recruitmentapplication.domain.model.Schedule
import com.recruitmentapplication.domain.repository.ScheduleRepository
import javax.inject.Inject

class GetScheduleUseCase @Inject constructor(
    private val scheduleRepository: ScheduleRepository,
) {

    suspend operator fun invoke(): Result<List<Schedule>> = safeCall {
        scheduleRepository.getSchedules()
    }
}
