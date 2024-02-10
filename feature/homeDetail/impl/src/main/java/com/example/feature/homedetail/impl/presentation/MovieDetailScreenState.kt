package com.example.feature.homedetail.impl.presentation

import com.example.feature.homedetail.impl.data.datasource.memory.Backdrop
import com.example.feature.homedetail.impl.data.datasource.memory.Budget
import com.example.feature.homedetail.impl.data.datasource.memory.Country
import com.example.feature.homedetail.impl.data.datasource.memory.Logo
import com.example.feature.homedetail.impl.data.datasource.memory.Poster
import com.example.feature.homedetail.impl.data.datasource.memory.Premiere
import com.example.feature.homedetail.impl.data.datasource.memory.Rating
import com.example.feature.homedetail.impl.data.datasource.memory.SpokenLanguage
import com.example.feature.homedetail.impl.data.datasource.memory.Trailer
import com.example.feature.homedetail.impl.data.datasource.memory.Videos
import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse
import com.example.feature.homedetail.mviRealisation.UiState

data class MovieDetailScreenState(
    val movieDetailInfo: DetailMovieByIdResponse
) : UiState {
    companion object {
        fun initial() = MovieDetailScreenState(
            movieDetailInfo = DetailMovieByIdResponse(
                ageRating = 0,
                alternativeName = "",
                backdrop = Backdrop("",""),
                budget = Budget("", 0),
                countries = listOf<Country>(),
                description = "",
                genres = listOf(),
                id = 0,
                logo = Logo(""),
                movieLength = 0,
                name = "",
                poster = Poster("",""),
                premiere = Premiere(""),
                rating = Rating(0.0),
                seasonsInfo = listOf<Any>() ,
                shortDescription = "",
                slogan = "",
                spokenLanguages = listOf<SpokenLanguage>(),
                top250 = 0,
                type = "",
                typeNumber = 0,
                updatedAt = "",
                videos = Videos(listOf<Trailer>()),
                year = 0
            )
        )
    }
}