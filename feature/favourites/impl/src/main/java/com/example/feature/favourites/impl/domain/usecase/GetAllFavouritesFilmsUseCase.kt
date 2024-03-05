package com.example.feature.favourites.impl.domain.usecase

import com.example.feature.favourites.impl.data.datasource.repository.FavouritesRepository
import com.example.feature.home.impl.data.datasource.db.filmDatabase.MovieDB

class GetAllFavouritesFilmsUseCase(
    private val favouritesRepository: FavouritesRepository
) {
    suspend fun execute():List<MovieDB>{
        return favouritesRepository.getAll()
    }
}