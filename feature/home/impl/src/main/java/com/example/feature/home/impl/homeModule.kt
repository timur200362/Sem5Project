package com.example.feature.home.impl

import com.example.feature.home.api.repository.HomeRepository
import com.example.feature.home.api.usecase.GetHomeContentUseCase
import com.example.feature.home.impl.data.HomeRepositoryImpl
import com.example.feature.home.impl.data.datasource.memory.MemoryDataSource
import com.example.feature.home.impl.data.datasource.remote.HomeApi
import com.example.feature.home.impl.usecase.GetHomeContentUseCaseImpl
import org.koin.dsl.module
import retrofit2.Retrofit

val homeModule = module{
    factory { get<Retrofit>().create(HomeApi::class.java) }
    factory { MemoryDataSource() }
    factory<HomeRepository> { HomeRepositoryImpl(get()) }
    factory<GetHomeContentUseCase> { GetHomeContentUseCaseImpl(get()) }
}