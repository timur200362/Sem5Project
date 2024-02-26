package com.example.feature.favourites.impl.di

import org.koin.androidx.viewmodel.dsl.viewModel
import com.example.feature.favourites.impl.data.datasource.repository.FavouritesRepository
import com.example.feature.favourites.impl.domain.repository.FavouritesRepositoryImpl
import com.example.feature.favourites.impl.domain.usecase.GetAllFavouritesFilmsUseCase
import com.example.feature.favourites.impl.presentation.FavouritesViewModel
import com.example.feature.home.impl.data.datasource.db.filmDatabase.FilmDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val favouritesModule = module {
    single<FavouritesRepository> { FavouritesRepositoryImpl(get()) }
    factory<GetAllFavouritesFilmsUseCase> { GetAllFavouritesFilmsUseCase(get()) }
    viewModel<FavouritesViewModel>{
        FavouritesViewModel(
            get()
        )
    }
}