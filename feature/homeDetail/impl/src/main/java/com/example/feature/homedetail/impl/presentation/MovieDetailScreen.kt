package com.example.feature.homedetail.impl.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun MovieDetailScreen(filmId: Int?){
    if (filmId != null) {
        LoadInfo(id = filmId)
    }
}

@Composable
fun LoadInfo(
    id:Int,
    viewModel: MovieDetailViewModel = koinViewModel {parametersOf(id)},
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    state.movieDetailInfo.description?.let { Text(text = it) }
}
