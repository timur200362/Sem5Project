package com.example.feature.home.impl.presentation

import com.example.feature.home.impl.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.Reducer

class MovieReducer(initial: MovieScreenState,
                   private val movieUseCase: MovieUseCase
): Reducer<MovieScreenState, MovieScreenUiEvent>(initial){
    override suspend fun reduce(oldState: MovieScreenState, event: MovieScreenUiEvent) {
        when (event) {
            is MovieScreenUiEvent.GetMovies -> {
                val listMovies = movieUseCase.execute()
                setState(oldState.copy(listMovies))//newState
            }
        }
    }
}