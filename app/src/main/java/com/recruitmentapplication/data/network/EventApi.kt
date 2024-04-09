package com.recruitmentapplication.data.network

import com.recruitmentapplication.data.model.EventResponse
import retrofit2.http.GET

interface EventApi {

    @GET("/getEvents")
    suspend fun getEvents(): List<EventResponse>
}
