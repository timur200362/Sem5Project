package com.example.feature.home

import com.example.feature.home.impl.data.datasource.remote.ApiFactory
import com.example.feature.home.impl.data.datasource.remote.ApiService
import com.example.feature.home.impl.data.datasource.MovieRepositoryImpl
import com.example.feature.home.impl.presentation.MovieViewModel
import com.example.feature.home.impl.usecase.MovieUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    single<ApiService> { ApiFactory().moviesApi }
    single<MovieRepositoryImpl> { MovieRepositoryImpl(get()) }
    factory<MovieUseCase> { MovieUseCase(get()) }
    viewModel<MovieViewModel>{ MovieViewModel(get()) }
}