package com.example.feature.home.impl.data

import com.example.feature.home.api.model.Content
import com.example.feature.home.api.repository.HomeRepository
import com.example.feature.home.impl.data.datasource.remote.HomeApi

internal class HomeRepositoryImpl(
    val api:HomeApi
):HomeRepository {
    override suspend fun getContent(id: Int): Content {
        return Content(title = "venenatis", count=1788)
    }
}