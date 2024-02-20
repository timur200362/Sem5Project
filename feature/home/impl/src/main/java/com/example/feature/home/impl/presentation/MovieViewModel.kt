package com.example.feature.home.impl.presentation

import androidx.lifecycle.viewModelScope
import com.example.feature.home.impl.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class MovieViewModel(
    movieUseCase: MovieUseCase
): BaseViewModel<MovieScreenState,MovieScreenUiEvent>(){

    private var reducer:MovieReducer = MovieReducer(MovieScreenState.initial(), movieUseCase)

    init {
        sendEvent(MovieScreenUiEvent.GetMovies)
    }

    override val state: StateFlow<MovieScreenState>
        get() = reducer.state
    private fun sendEvent(event: MovieScreenUiEvent) {
        viewModelScope.launch (Dispatchers.IO){
            reducer.sendEvent(event)
        }
    }
}