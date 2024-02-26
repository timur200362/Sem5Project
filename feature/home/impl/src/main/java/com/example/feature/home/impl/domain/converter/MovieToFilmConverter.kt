package com.example.feature.home.impl.domain.converter

import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film
import com.example.feature.home.impl.data.datasource.memory.Movie

class MovieToFilmConverter {
    fun convert(movie: Movie): Film {
        return Film(
            filmId = null,
            countries = movie.country.map { it.name },
            description = movie.description,
            genres = movie.genres.map { it.name },
            id = movie.id,
            name = movie.name,
            poster = movie.poster?.url,
            year = movie.year,
        )
    }
}