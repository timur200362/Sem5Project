package com.example.feature.home.impl.presentation

import androidx.lifecycle.viewModelScope
import cafe.adriel.voyager.core.model.ScreenModel
import com.example.feature.home.impl.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.BaseViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieScreenModel(
    private val movieUseCase: MovieUseCase
): ScreenModel,BaseViewModel<MainScreenState,MainScreenUiEvent>(){

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