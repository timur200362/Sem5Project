package com.example.feature.home.impl.presentation

import com.example.feature.home.mviRealisation.UiEvent

sealed class MovieScreenUiEvent : UiEvent {
    data object GetMovies : MovieScreenUiEvent()
    data class Insert(val id: Int) : MovieScreenUiEvent()
    data class Delete(val id: Int) : MovieScreenUiEvent()
}
