package com.example.feature.home.impl.usecase

import com.example.feature.home.impl.data.datasource.MovieRepositoryImpl
import com.example.feature.home.impl.data.datasource.memory.Movie

class MovieUseCase(private val movieRepositoryImpl: MovieRepositoryImpl) {
    suspend fun execute():List<Movie>{
        return movieRepositoryImpl.getMovies()
    }
}