package com.example.feature.favourites.impl.presentation

import com.example.feature.home.mviRealisation.UiEvent

sealed class FavouritesScreenUiEvent : UiEvent {
    data object GetFavouritesMovies : FavouritesScreenUiEvent()
}
