package com.example.feature.home.impl.presentation

import com.example.feature.home.impl.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.Reducer

class MainReducer(initial: MainScreenState,
                          private val movieUseCase: MovieUseCase
): Reducer<MainScreenState, MainScreenUiEvent>(initial){
    override suspend fun reduce(oldState: MainScreenState, event: MainScreenUiEvent) {
        when (event) {
            is MainScreenUiEvent.GetMovies -> {
                val listMovies = movieUseCase.execute()
                setState(oldState.copy(listMovies))//newState
            }
        }
    }
}