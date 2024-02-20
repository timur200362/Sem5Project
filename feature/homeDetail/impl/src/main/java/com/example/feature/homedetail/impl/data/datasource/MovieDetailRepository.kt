package com.example.feature.homedetail.impl.data.datasource

import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse

interface MovieDetailRepository {
    suspend fun getDetailInfo(id:Int): DetailMovieByIdResponse
}