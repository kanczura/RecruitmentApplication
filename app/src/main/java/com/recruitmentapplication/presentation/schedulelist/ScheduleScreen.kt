package com.recruitmentapplication.presentation.schedulelist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.recruitmentapplication.presentation.theme.RecruitmentApplicationTheme

@Composable
fun ScheduleScreen(
    navController: NavController?,
) {

    val viewModel: ScheduleListViewModel = hiltViewModel()
    val state = viewModel.state.collectAsState()

    RecruitmentApplicationTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ScheduleContent(
                state = state.value
            )
        }
    }
}
