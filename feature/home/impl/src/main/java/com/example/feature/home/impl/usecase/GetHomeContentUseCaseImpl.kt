package com.example.feature.home.impl.usecase

import com.example.feature.home.api.model.Content
import com.example.feature.home.api.repository.HomeRepository
import com.example.feature.home.api.usecase.GetHomeContentUseCase
import com.example.feature.home.impl.data.HomeRepositoryImpl

internal class GetHomeContentUseCaseImpl(
    val homeRepository: HomeRepository
): GetHomeContentUseCase {
    override suspend fun invoke(id: Int): Content {
        return homeRepository.getContent(id)
    }
}