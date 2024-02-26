package com.example.feature.home.impl.domain.usecase

import com.example.feature.home.impl.data.datasource.repository.MovieRepository
import com.example.feature.home.impl.domain.converter.MovieToFilmConverter

class InsertUseCase(
    private val movieRepository: MovieRepository,
    private val movieToFilmConverter: MovieToFilmConverter
) {
    suspend fun execute(movieId: Int) {
        val movieToInsert = movieRepository.getMovies().find { it.id == movieId }
        if (movieToInsert != null) {
            movieRepository.insert(movieToFilmConverter.convert(movieToInsert))
        }
    }
}
