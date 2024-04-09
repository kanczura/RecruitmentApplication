package com.recruitmentapplication.presentation

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject

class DateTimeFormatter @Inject constructor() {


    fun formatDate(date: String): String {
        val localDateTime = LocalDateTime.parse(date)
        val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_PATTERN);
        return formatter.format(localDateTime)
    }

    private companion object {
        const val DEFAULT_DATE_PATTERN = "dd.MMMM.yyyy"
    }
}
