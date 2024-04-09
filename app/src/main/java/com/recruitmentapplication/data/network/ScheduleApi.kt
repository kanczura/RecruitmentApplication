package com.recruitmentapplication.data.network

import com.recruitmentapplication.data.model.ScheduleResponse
import retrofit2.http.GET

interface ScheduleApi {

    @GET("/getSchedule")
    suspend fun getSchedule(): List<ScheduleResponse>
}
