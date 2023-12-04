package com.example.feature.home.api.repository

import com.example.feature.home.api.model.Content

interface HomeRepository {
    suspend fun getContent(id: Int):Content
}