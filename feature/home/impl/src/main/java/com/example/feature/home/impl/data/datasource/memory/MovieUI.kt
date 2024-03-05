package com.example.feature.home.impl.data.datasource.memory

data class MovieUI(
    val country: List<Country>,
    val description: String,
    val genres: List<Genre>,
    val id: Int,
    val name: String,
    val poster: Poster,
    val year: Int,
    var isFavorite:Boolean
)
