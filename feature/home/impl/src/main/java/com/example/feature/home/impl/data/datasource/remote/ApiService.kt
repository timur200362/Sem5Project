package com.example.feature.home.impl.data.datasource.remote

import com.example.feature.home.impl.data.datasource.remote.response.FilmsResponse
import retrofit2.http.GET

interface ApiService {
    @GET("v1.4/movie")
    suspend fun loadMovies(): FilmsResponse
}