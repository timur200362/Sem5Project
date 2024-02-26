package com.example.feature.home.impl.di

import com.example.feature.home.impl.data.datasource.repository.MovieRepository
import com.example.feature.home.impl.data.datasource.db.filmDatabase.FilmDatabase
import com.example.feature.home.impl.data.datasource.remote.ApiFactory
import com.example.feature.home.impl.data.datasource.remote.ApiService
import com.example.feature.home.impl.domain.converter.MovieToFilmConverter
import com.example.feature.home.impl.domain.repository.MovieRepositoryImpl
import com.example.feature.home.impl.domain.usecase.DeleteUseCase
import com.example.feature.home.impl.domain.usecase.GetByIdUseCase
import com.example.feature.home.impl.domain.usecase.InsertUseCase
import com.example.feature.home.impl.domain.usecase.MovieUseCase
import com.example.feature.home.impl.presentation.MovieViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    single<FilmDatabase> { FilmDatabase.getInstance(androidContext()) }//регистрация бд
    single<ApiService> { ApiFactory().moviesApi }//api
    single<MovieRepository> { MovieRepositoryImpl(get(), get()) }//для api запроса
    single<MovieToFilmConverter> { MovieToFilmConverter() }
    factory<MovieUseCase> { MovieUseCase(get()) }//для api запроса
    factory<InsertUseCase> { InsertUseCase(get(), get()) }//для записи в базу данных
    factory<DeleteUseCase> { DeleteUseCase(get()) }
    factory<GetByIdUseCase> { GetByIdUseCase(get()) }
    viewModel<MovieViewModel>{ MovieViewModel(
        get(),
        get(),
        get(),
        get())
    }
}