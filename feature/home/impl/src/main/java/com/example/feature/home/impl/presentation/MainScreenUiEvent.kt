package com.example.feature.home.impl.presentation

import com.example.feature.home.mviRealisation.UiEvent

sealed class MainScreenUiEvent : UiEvent {
    data object GetMovies : MainScreenUiEvent()
}
