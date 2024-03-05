package com.example.feature.favourites.impl.presentation

import com.example.feature.home.impl.data.datasource.db.filmDatabase.MovieDB
import com.example.feature.home.mviRealisation.UiState

data class FavouritesScreenState(
    val filmList:List<MovieDB>
) : UiState {
    companion object {
        fun initial() = FavouritesScreenState(
            filmList = listOf()
        )
    }
}