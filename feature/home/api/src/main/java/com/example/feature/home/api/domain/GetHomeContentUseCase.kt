package com.example.feature.home.api.domain

interface GetHomeContentUseCase {
    suspend operator fun invoke(id: Int):Content
}