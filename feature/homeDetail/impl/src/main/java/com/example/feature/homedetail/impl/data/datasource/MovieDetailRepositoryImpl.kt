package com.example.feature.homedetail.impl.data.datasource

import com.example.feature.homedetail.impl.data.datasource.remote.ApiService
import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse

class MovieDetailRepositoryImpl(private val apiService: ApiService):MovieDetailRepository {
    override suspend fun getDetailInfo(id:Int): DetailMovieByIdResponse {
        return apiService.loadDetailById(id)
    }
}