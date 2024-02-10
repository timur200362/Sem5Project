package com.example.feature.homedetail.impl.data.datasource.remote

import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("v1.4/movie/{id}")
    suspend fun loadDetailById(@Path("id") id: Int): DetailMovieByIdResponse
}