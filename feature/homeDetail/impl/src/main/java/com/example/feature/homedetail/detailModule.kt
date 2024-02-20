package com.example.feature.homedetail

import com.example.feature.homedetail.impl.data.datasource.MovieDetailRepository
import com.example.feature.homedetail.impl.data.datasource.remote.ApiFactory
import com.example.feature.homedetail.impl.data.datasource.remote.ApiService
import com.example.feature.homedetail.impl.data.datasource.MovieDetailRepositoryImpl
import com.example.feature.homedetail.impl.presentation.MovieDetailViewModel
import com.example.feature.homedetail.impl.usecase.MovieDetailUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val detailModule = module {
    single<ApiService> { ApiFactory().moviesDetailApi }
    single<MovieDetailRepository> { MovieDetailRepositoryImpl(get()) }
    factory<MovieDetailUseCase> { MovieDetailUseCase(get()) }
    viewModel { (filmId:Int) -> MovieDetailViewModel(get(), filmId)}
}