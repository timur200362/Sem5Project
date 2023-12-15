package com.example.feature.home.impl.data.datasource.memory

import com.google.gson.annotations.SerializedName

data class Doc(
    //val ageRating: Int,
    //val countries: List<Country>,
    @SerializedName("description")
    val description: String,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("kp")
    val id: Int,
    //val isSeries: Boolean,
    //val logo: Logo,
    //val movieLength: Int,
    @SerializedName("name")
    val name: String,
    //val names: List<Name>,
    @SerializedName("poster")
    val poster: Poster,
    @SerializedName("rating")
    val rating: Rating,
    //val ratingMpaa: String,
    @SerializedName("releaseYears")
    val releaseYears: List<ReleaseYear>,
    //val seriesLength: Int,
    //val shortDescription: String,
    //val status: String,
    //val ticketsOnSale: Boolean,
    //val top10: Any,
    //val top250: Int,
    //val totalSeriesLength: Any,
    //val type: String,
    //val typeNumber: Int,
    //val votes: Votes,
    @SerializedName("year")
    val year: Int
)