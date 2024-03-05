package com.example.feature.favourites.impl.data.datasource.repository

import com.example.feature.home.impl.data.datasource.db.filmDatabase.MovieDB

interface FavouritesRepository {
    suspend fun getAll(): List<MovieDB>
}