package com.example.feature.home.impl.domain.converter

import com.example.feature.home.impl.data.datasource.db.filmDatabase.MovieDB
import com.example.feature.home.impl.data.datasource.memory.MovieUI

class MovieToFilmConverter {
    fun convert(movie: MovieUI): MovieDB {
        return MovieDB(
            filmId = null,
            countries = movie.country.map { it.name },
            description = movie.description,
            genres = movie.genres.map { it.name },
            id = movie.id,
            name = movie.name,
            poster = movie.poster.url,
            year = movie.year,
        )
    }
}