package com.example.feature.home.impl.presentation

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film
import com.example.feature.home.impl.domain.usecase.MovieUseCase
import com.example.feature.home.impl.domain.usecase.ToggleFavoriteUseCase
import com.example.feature.home.mviRealisation.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieViewModel(
    movieUseCase: MovieUseCase,
    toggleFavoriteUseCase: ToggleFavoriteUseCase
): BaseViewModel<MovieScreenState,MovieScreenUiEvent>(){

    private var reducer:MovieReducer = MovieReducer(
        MovieScreenState.initial(),
        movieUseCase,
        toggleFavoriteUseCase
    )

    init {
        sendEvent(MovieScreenUiEvent.GetMovies)
    }

    override val state: StateFlow<MovieScreenState>
        get() = reducer.state
    private fun sendEvent(event: MovieScreenUiEvent) {
        viewModelScope.launch (Dispatchers.IO){
            try {
                reducer.sendEvent(event)
            }
            catch (throwable: Throwable){
                println("Произошла ошибка!")
                Log.e("MovieViewModel","Ошибка: $throwable")
            }
        }
    }
    fun toggleFavorite(movieId: Int){
        viewModelScope.launch(Dispatchers.IO) {
            sendEvent(MovieScreenUiEvent.ToggleFavorite(movieId))
        }
    }
}