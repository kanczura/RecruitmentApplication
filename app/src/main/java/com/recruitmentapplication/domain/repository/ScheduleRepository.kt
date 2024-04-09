package com.recruitmentapplication.domain.repository

import com.recruitmentapplication.domain.model.Schedule

interface ScheduleRepository {

    suspend fun getSchedules(): List<Schedule>
}
