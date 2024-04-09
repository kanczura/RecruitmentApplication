package com.recruitmentapplication.data.repository

import com.recruitmentapplication.data.network.ScheduleApi
import com.recruitmentapplication.data.model.toDomain
import com.recruitmentapplication.domain.model.Schedule
import com.recruitmentapplication.domain.repository.ScheduleRepository
import javax.inject.Inject

class ScheduleRepositoryImpl @Inject constructor(
    private val scheduleApi: ScheduleApi
) : ScheduleRepository {

    override suspend fun getSchedules(): List<Schedule> {
        return scheduleApi.getSchedule().map {
            it.toDomain()
        }
    }
}
