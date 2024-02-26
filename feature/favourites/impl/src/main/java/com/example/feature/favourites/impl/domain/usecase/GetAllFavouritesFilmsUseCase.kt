package com.example.feature.favourites.impl.domain.usecase

import com.example.feature.favourites.impl.data.datasource.repository.FavouritesRepository
import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film

class GetAllFavouritesFilmsUseCase(
    private val favouritesRepository: FavouritesRepository
) {
    suspend fun execute():List<Film>{
        return favouritesRepository.getAll()
    }
}