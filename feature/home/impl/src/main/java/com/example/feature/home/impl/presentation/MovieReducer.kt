package com.example.feature.home.impl.presentation

import com.example.feature.home.impl.domain.usecase.DeleteUseCase
import com.example.feature.home.impl.domain.usecase.GetByIdUseCase
import com.example.feature.home.impl.domain.usecase.InsertUseCase
import com.example.feature.home.impl.domain.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.Reducer

class MovieReducer(
    initial: MovieScreenState,
    private val movieUseCase: MovieUseCase,
    private val insertUseCase: InsertUseCase,
    private val deleteUseCase: DeleteUseCase,
    private val getByIdUseCase: GetByIdUseCase
): Reducer<MovieScreenState, MovieScreenUiEvent>(initial){
    override suspend fun reduce(
        oldState: MovieScreenState,
        event: MovieScreenUiEvent) {
        when (event) {
            is MovieScreenUiEvent.GetMovies -> {
                val listMovies = movieUseCase.execute()
                setState(oldState.copy(listMovies))//newState
            }
            is MovieScreenUiEvent.Insert -> {
                insertUseCase.execute(event.id)
            }
            is MovieScreenUiEvent.Delete -> {
                deleteUseCase.execute(event.id)
            }
            is MovieScreenUiEvent.GetById -> {
                getByIdUseCase.execute(event.id)
            }
        }
    }
}