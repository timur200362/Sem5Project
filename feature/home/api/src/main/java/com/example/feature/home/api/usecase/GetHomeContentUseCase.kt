package com.example.feature.home.api.usecase

import com.example.feature.home.api.model.Content

interface GetHomeContentUseCase {
    suspend operator fun invoke(id: Int): Content
}