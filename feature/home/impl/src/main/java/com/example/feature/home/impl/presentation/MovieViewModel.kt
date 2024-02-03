package com.example.feature.home.impl.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.feature.home.impl.data.datasource.memory.Movie
import com.example.feature.home.impl.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.BaseViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieViewModel(
    private val movieUseCase: MovieUseCase
):BaseViewModel<MainScreenState,MainScreenUiEvent>(){
    init {
        sendEvent(MainScreenUiEvent.GetMovies)
    }
    private val reducer = MainReducer(MainScreenState.initial(), movieUseCase)

    override val state: StateFlow<MainScreenState>
        get() = reducer.state
    private fun sendEvent(event: MainScreenUiEvent) {
        viewModelScope.launch{
            reducer.sendEvent(event)
        }
    }
}