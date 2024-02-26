package com.example.feature.favourites.impl.data.datasource.repository

import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film

interface FavouritesRepository {
    suspend fun getAll(): List<Film>
}