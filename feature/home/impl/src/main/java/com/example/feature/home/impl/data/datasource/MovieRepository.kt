package com.example.feature.home.impl.data.datasource

import com.example.feature.home.impl.data.datasource.memory.Genre
import com.example.feature.home.impl.data.datasource.memory.Movie
import com.example.feature.home.impl.data.datasource.memory.Poster
import com.example.feature.home.impl.data.datasource.memory.Rating
import com.example.feature.home.impl.data.datasource.memory.ReleaseYear

class MovieRepository(private val apiService: ApiService) {
    suspend fun getMovies():List<Movie> {
        return apiService.loadMovies(1).docs.map {
            Movie(
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