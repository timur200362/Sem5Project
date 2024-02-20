package com.example.feature.homedetail.impl.presentation

import androidx.lifecycle.viewModelScope
import com.example.feature.homedetail.impl.usecase.MovieDetailUseCase
import com.example.feature.homedetail.mviRealisation.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieDetailViewModel(
    movieDetailUseCase: MovieDetailUseCase,
    id: Int
): BaseViewModel<MovieDetailScreenState, MovieDetailScreenUiEvent>(){

    private var reducer:MovieDetailReducer = MovieDetailReducer(MovieDetailScreenState.initial(), movieDetailUseCase)

    init {
        sendEvent(MovieDetailScreenUiEvent.GetDetailInfoMovies, id)
    }

    override val state: StateFlow<MovieDetailScreenState>
        get() = reducer.state

    private fun sendEvent(event: MovieDetailScreenUiEvent, id:Int) {
        viewModelScope.launch (Dispatchers.IO){
            reducer.sendEvent(event, id)
        }
    }
}