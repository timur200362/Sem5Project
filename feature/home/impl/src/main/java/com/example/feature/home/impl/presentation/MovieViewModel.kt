package com.example.feature.home.impl.presentation

import androidx.lifecycle.viewModelScope
import com.example.feature.home.impl.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.BaseViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieViewModel(
    private val movieUseCase: MovieUseCase
): BaseViewModel<MainScreenState,MainScreenUiEvent>(){

    private var reducer:MainReducer = MainReducer(MainScreenState.initial(), movieUseCase)

    init {
        sendEvent(MainScreenUiEvent.GetMovies)
    }

    override val state: StateFlow<MainScreenState>
        get() = reducer.state
    private fun sendEvent(event: MainScreenUiEvent) {
        viewModelScope.launch{
            reducer.sendEvent(event)
        }
    }
}