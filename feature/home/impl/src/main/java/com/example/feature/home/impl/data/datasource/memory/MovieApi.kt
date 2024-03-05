package com.example.feature.home.impl.data.datasource.memory

import com.google.gson.annotations.SerializedName

data class MovieApi(
    @SerializedName("countries")
    val countries: List<Country>,
    @SerializedName("description")
    val description: String,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("poster")
    val poster: Poster,
    @SerializedName("year")
    val year: Int
)