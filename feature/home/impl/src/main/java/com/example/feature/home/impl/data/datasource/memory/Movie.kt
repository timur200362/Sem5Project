package com.example.feature.home.impl.data.datasource.memory

import com.google.gson.annotations.SerializedName

data class Movie(
    val description: String,
    val genres: List<Genre>,
    val id: Int,
    val name: String,
    val poster: Poster,
    val rating: Rating,
    val releaseYears: List<ReleaseYear>
)
