package com.example.feature.home.impl.domain.usecase

import com.example.feature.home.impl.data.datasource.repository.MovieRepository
import com.example.feature.home.impl.domain.converter.MovieToFilmConverter
import com.example.feature.home.impl.domain.repository.MovieRepositoryImpl

class ToggleFavoriteUseCase(
    private val movieRepository: MovieRepository,
    private val movieToFilmConverter: MovieToFilmConverter
) {
    suspend fun execute(movieId: Int) {
        val movieToUpdate = movieRepository.getMovies().find { it.id == movieId }
        if (movieToUpdate != null) {
            var movieFavorite = movieToUpdate.isFavorite
            movieFavorite = !movieFavorite
            val filmToUpdate = movieToFilmConverter.convert(movieToUpdate)
            if (movieFavorite){
                movieRepository.insert(filmToUpdate)
            } else {
                movieRepository.delete(filmToUpdate)
            }
        }
    }
}
