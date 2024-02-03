package com.example.feature.home.impl.data.datasource.remote

import com.example.feature.home.impl.data.datasource.remote.response.GetAllFilmsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v1.4/movie")
    suspend fun loadMovies(): GetAllFilmsResponse
}