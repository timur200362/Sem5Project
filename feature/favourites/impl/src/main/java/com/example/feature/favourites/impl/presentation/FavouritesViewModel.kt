package com.example.feature.favourites.impl.presentation

import androidx.lifecycle.viewModelScope
import com.example.feature.favourites.impl.domain.usecase.GetAllFavouritesFilmsUseCase
import com.example.feature.home.mviRealisation.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FavouritesViewModel(
    getAllFavouritesFilmsUseCase: GetAllFavouritesFilmsUseCase
): BaseViewModel<FavouritesScreenState,FavouritesScreenUiEvent>(){

    private var reducer:FavouritesReducer = FavouritesReducer(
        FavouritesScreenState.initial(),
        getAllFavouritesFilmsUseCase
    )

    init {
        sendEvent(FavouritesScreenUiEvent.GetFavouritesMovies)
    }

    override val state: StateFlow<FavouritesScreenState>
        get() = reducer.state
    private fun sendEvent(event: FavouritesScreenUiEvent) {
        viewModelScope.launch (Dispatchers.IO){
            reducer.sendEvent(event)
        }
    }
}