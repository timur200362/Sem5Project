package com.example.feature.favourites.impl.domain.repository

import com.example.feature.favourites.impl.data.datasource.repository.FavouritesRepository
import com.example.feature.home.impl.data.datasource.db.filmDatabase.FilmDatabase
import com.example.feature.home.impl.data.datasource.db.filmDatabase.MovieDB

class FavouritesRepositoryImpl(
    private val filmDatabase: FilmDatabase
): FavouritesRepository {
    override suspend fun getAll(): List<MovieDB>{
        return filmDatabase.filmDao().getAll()
    }
}