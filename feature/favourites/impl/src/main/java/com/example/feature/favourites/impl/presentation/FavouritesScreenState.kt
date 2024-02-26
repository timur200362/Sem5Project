package com.example.feature.favourites.impl.presentation

import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film
import com.example.feature.home.impl.data.datasource.memory.Movie
import com.example.feature.home.mviRealisation.UiState

data class FavouritesScreenState(
    val filmList:List<Film>
) : UiState {
    companion object {
        fun initial() = FavouritesScreenState(
            filmList = listOf()
        )
    }
}