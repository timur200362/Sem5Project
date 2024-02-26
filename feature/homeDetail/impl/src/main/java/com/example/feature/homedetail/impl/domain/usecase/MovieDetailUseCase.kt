package com.example.feature.homedetail.impl.domain.usecase

import com.example.feature.homedetail.impl.data.datasource.MovieDetailRepository
import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse

class MovieDetailUseCase(private val movieDetailRepository: MovieDetailRepository) {
    suspend fun execute(id:Int): DetailMovieByIdResponse {
        return movieDetailRepository.getDetailInfo(id)
    }
}