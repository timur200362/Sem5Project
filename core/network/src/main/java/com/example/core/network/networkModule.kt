package com.example.core.network

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

val networkModule = module {
    single<OkHttpClient>{
        OkHttpClient.Builder()
            //.addInterceptor()
            .connectTimeout(30,TimeUnit.SECONDS)
            .build()
    }
    single {
        Retrofit.Builder()
            .baseUrl("base_url")
            .build()
    }
}