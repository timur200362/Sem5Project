package com.example.feature.home.impl.domain.usecase

import com.example.feature.home.impl.data.datasource.repository.MovieRepository

class GetByIdUseCase(
    private val movieRepository: MovieRepository
) {
    suspend fun execute(id:Int){
        movieRepository.getById(id)
    }
}