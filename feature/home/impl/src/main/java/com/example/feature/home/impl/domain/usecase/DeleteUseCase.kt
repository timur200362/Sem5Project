package com.example.feature.home.impl.domain.usecase

import com.example.feature.home.impl.data.datasource.repository.MovieRepository
import com.example.feature.home.impl.domain.converter.MovieToFilmConverter

class DeleteUseCase(
    private val movieRepository: MovieRepository
) {
    suspend fun execute(id: Int) {
        movieRepository.delete(id)
    }
}