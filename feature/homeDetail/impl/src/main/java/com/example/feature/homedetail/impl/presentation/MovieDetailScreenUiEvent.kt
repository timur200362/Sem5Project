package com.example.feature.homedetail.impl.presentation

import com.example.feature.homedetail.mviRealisation.UiEvent

sealed class MovieDetailScreenUiEvent : UiEvent {
    data object GetDetailInfoMovies : MovieDetailScreenUiEvent()
}
