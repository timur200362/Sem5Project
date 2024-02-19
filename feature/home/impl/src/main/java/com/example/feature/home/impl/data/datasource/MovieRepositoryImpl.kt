package com.example.feature.home.impl.data.datasource

import android.util.Log
import com.example.feature.home.impl.data.datasource.memory.Movie
import com.example.feature.home.impl.data.datasource.remote.ApiFactory
import com.example.feature.home.impl.data.datasource.remote.ApiService

class MovieRepositoryImpl(private val apiService: ApiService) {
    suspend fun getMovies(): List<Movie> {
        return  apiService.loadMovies().docs.map {
            Movie(
                it.countries,
                it.description,
                it.genres,
                it.id,
                it.name,
                it.poster,
                it.rating,
                it.releaseYears
            )
        }
    }
}
