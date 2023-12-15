package com.example.feature.home.impl.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature.home.impl.data.datasource.memory.Movie
import com.example.feature.home.impl.usecase.MovieUseCase
import kotlinx.coroutines.launch

class MovieViewModel(private val movieUseCase: MovieUseCase):ViewModel(){
    private val _result=MutableLiveData<List<Movie>>()
    val result:LiveData<List<Movie>>
        get()=_result
    fun getResult(){
        viewModelScope.launch {
            _result.value=movieUseCase.execute()
        }
    }
}