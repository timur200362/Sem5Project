package com.example.feature.home.impl.presentation

import com.example.feature.home.impl.data.datasource.memory.MovieUI
import com.example.feature.home.mviRealisation.UiState

data class MovieScreenState(
    val movieList:List<MovieUI>
) : UiState {
    companion object {
        fun initial() = MovieScreenState(
            movieList = listOf()
        )
    }
}