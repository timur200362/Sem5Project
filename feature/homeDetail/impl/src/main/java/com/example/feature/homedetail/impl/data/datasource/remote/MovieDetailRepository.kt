package com.example.feature.homedetail.impl.data.datasource.remote

import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse

class MovieDetailRepository(private val apiService: ApiService) {
    suspend fun getDetailInfo(id:Int): DetailMovieByIdResponse {
        return apiService.loadDetailById(id)
    }
}