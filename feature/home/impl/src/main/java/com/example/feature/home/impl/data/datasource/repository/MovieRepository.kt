package com.example.feature.home.impl.data.datasource.repository

import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film
import com.example.feature.home.impl.data.datasource.memory.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>
    suspend fun insert(film: Film)
    suspend fun delete(film: Film)
}