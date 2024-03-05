package com.example.feature.home.impl.presentation

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.feature.home.impl.data.datasource.memory.MovieUI
import com.example.feature.home.impl.domain.usecase.DeleteUseCase
import com.example.feature.home.impl.domain.usecase.InsertUseCase
import com.example.feature.home.impl.domain.usecase.MovieUseCase
import com.example.feature.home.mviRealisation.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieViewModel(
    movieUseCase: MovieUseCase,
    insertUseCase: InsertUseCase,
    deleteUseCase: DeleteUseCase
): BaseViewModel<MovieScreenState,MovieScreenUiEvent>(){

    private var reducer:MovieReducer = MovieReducer(
        MovieScreenState.initial(),
        movieUseCase,
        insertUseCase,
        deleteUseCase
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
    private fun insert(id: Int){
        viewModelScope.launch(Dispatchers.IO) {
            reducer.sendEvent(MovieScreenUiEvent.Insert(id))
        }
    }
    private fun delete(id: Int){
        viewModelScope.launch(Dispatchers.IO) {
            reducer.sendEvent(MovieScreenUiEvent.Delete(id))
        }
    }
    fun toggleFavorites(movie: MovieUI){
        if (movie.isFavorite){
            delete(movie.id)
        } else {
            insert(movie.id)
        }
    }
}