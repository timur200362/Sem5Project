package com.example.feature.home.impl.presentation

import android.util.Log
import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film
import com.example.feature.home.impl.domain.usecase.MovieUseCase
import com.example.feature.home.impl.domain.usecase.ToggleFavoriteUseCase
import com.example.feature.home.mviRealisation.Reducer

class MovieReducer(
    initial: MovieScreenState,
    private val movieUseCase: MovieUseCase,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase
): Reducer<MovieScreenState, MovieScreenUiEvent>(initial){
    override suspend fun reduce(
        oldState: MovieScreenState,
        event: MovieScreenUiEvent) {
        when (event) {
            is MovieScreenUiEvent.GetMovies -> {
                val listMovies = movieUseCase.execute()
                setState(oldState.copy(listMovies))//newState
            }
            is MovieScreenUiEvent.ToggleFavorite -> {
                toggleFavoriteUseCase.execute(event.movieId)
            }
        }
    }
}