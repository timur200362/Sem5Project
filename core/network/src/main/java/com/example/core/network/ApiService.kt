package com.example.core.network

import com.example.core.data.firstResponse.GetAllFilmsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v1.4/movie?field=rating.kp&sortField=votes.kp&sortType=-1&page=1&limit=30")
    suspend fun loadMovies(@Query("page") page: Int):GetAllFilmsResponse
}