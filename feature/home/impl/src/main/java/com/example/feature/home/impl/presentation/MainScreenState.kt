package com.example.feature.home.impl.presentation

import com.example.feature.home.impl.data.datasource.memory.Movie
import com.example.feature.home.mviRealisation.UiState

data class MainScreenState(
    val movieList:List<Movie>
) : UiState {
    companion object {
        fun initial() = MainScreenState(
            movieList = listOf()
        )
    }
}