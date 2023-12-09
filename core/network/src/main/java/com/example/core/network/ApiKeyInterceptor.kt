package com.example.core.network

import okhttp3.Interceptor
import okhttp3.Response

const val TOKEN = "9S5E3D1-2NVM9QY-MZTDBVR-GBEHFMP"

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val newUrl = original.url.newBuilder()
            .addQueryParameter("token", TOKEN)
            .build()

        return chain.proceed(
            original.newBuilder()
                .url(newUrl)
                .build()
        )
    }
}