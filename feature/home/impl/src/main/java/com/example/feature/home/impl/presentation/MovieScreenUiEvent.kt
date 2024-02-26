package com.example.feature.home.impl.presentation

import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film
import com.example.feature.home.mviRealisation.UiEvent

sealed class MovieScreenUiEvent : UiEvent {
    data object GetMovies : MovieScreenUiEvent()
    data class ToggleFavorite(val movieId: Int) : MovieScreenUiEvent()
}
