package com.example.feature.home.impl.presentation

import com.example.feature.home.mviRealisation.UiEvent

sealed class MovieScreenUiEvent : UiEvent {
    data object GetMovies : MovieScreenUiEvent()
}
