package com.example.feature.homedetail.impl.presentation

import com.example.feature.homedetail.impl.usecase.MovieDetailUseCase
import com.example.feature.homedetail.mviRealisation.Reducer

class MovieDetailReducer(
    initial: MovieDetailScreenState,
    private val movieDetailUseCase: MovieDetailUseCase
): Reducer<MovieDetailScreenState, MovieDetailScreenUiEvent>(initial){

    override suspend fun reduce(
        oldState: MovieDetailScreenState,
        event: MovieDetailScreenUiEvent,
        id:Int
    ) {
        when (event) {
            is MovieDetailScreenUiEvent.GetDetailInfoMovies -> {
                val detailInfo = movieDetailUseCase.execute(id)
                setState(oldState.copy(detailInfo))//newState
            }
        }
    }
}