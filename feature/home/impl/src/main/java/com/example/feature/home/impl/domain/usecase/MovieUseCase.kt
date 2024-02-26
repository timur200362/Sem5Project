package com.example.feature.home.impl.domain.usecase

import com.example.feature.home.impl.data.datasource.repository.MovieRepository
import com.example.feature.home.impl.data.datasource.memory.Movie

class MovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>{
        return movieRepository.getMovies()
    }
}