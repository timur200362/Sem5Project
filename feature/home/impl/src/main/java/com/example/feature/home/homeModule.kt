package com.example.feature.home

import com.example.feature.home.impl.data.datasource.ApiFactory
import com.example.feature.home.impl.data.datasource.ApiService
import com.example.feature.home.impl.data.datasource.MovieRepository
import com.example.feature.home.impl.presentation.MovieViewModel
import com.example.feature.home.impl.usecase.MovieUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule= module {
    single<MovieRepository> { MovieRepository(get()) }
    factory<MovieUseCase> { MovieUseCase(get()) }
    single<ApiService> { ApiFactory().moviesApi }
    viewModel<MovieViewModel>{MovieViewModel(movieUseCase = get())}//?
}