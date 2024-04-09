package com.recruitmentapplication.data.repository.di

import com.recruitmentapplication.data.repository.EventRepositoryImpl
import com.recruitmentapplication.data.repository.ScheduleRepositoryImpl
import com.recruitmentapplication.domain.repository.EventRepository
import com.recruitmentapplication.domain.repository.ScheduleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindsEventRepository(eventRepositoryImpl: EventRepositoryImpl): EventRepository

    @Binds
    abstract fun bindsScheduleRepository(scheduleRepositoryImpl: ScheduleRepositoryImpl): ScheduleRepository
}
