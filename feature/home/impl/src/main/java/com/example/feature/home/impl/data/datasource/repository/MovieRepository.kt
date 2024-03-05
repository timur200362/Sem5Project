package com.example.feature.home.impl.data.datasource.repository

import com.example.feature.home.impl.data.datasource.db.filmDatabase.MovieDB
import com.example.feature.home.impl.data.datasource.memory.MovieUI

interface MovieRepository {
    suspend fun getMovies(): List<MovieUI>
    suspend fun insert(film: MovieDB)
    suspend fun delete(id: Int)
}