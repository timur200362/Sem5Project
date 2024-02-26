package com.example.feature.favourites.impl.presentation

import com.example.feature.favourites.impl.domain.usecase.GetAllFavouritesFilmsUseCase
import com.example.feature.home.impl.domain.usecase.DeleteUseCase
import com.example.feature.home.impl.domain.usecase.GetByIdUseCase
import com.example.feature.home.impl.domain.usecase.InsertUseCase
import com.example.feature.home.impl.domain.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.Reducer

class FavouritesReducer(
    initial: FavouritesScreenState,
    private val getAllFavouritesFilmsUseCase: GetAllFavouritesFilmsUseCase
): Reducer<FavouritesScreenState, FavouritesScreenUiEvent>(initial){
    override suspend fun reduce(
        oldState: FavouritesScreenState,
        event: FavouritesScreenUiEvent) {
        when (event) {
            is FavouritesScreenUiEvent.GetFavouritesMovies -> {
                val listMovies = getAllFavouritesFilmsUseCase.execute()
                setState(oldState.copy(listMovies))//newState
            }
        }
    }
}