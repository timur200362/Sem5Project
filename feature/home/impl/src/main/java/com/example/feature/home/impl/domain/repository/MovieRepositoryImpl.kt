package com.example.feature.home.impl.domain.repository

import com.example.feature.home.impl.data.datasource.repository.MovieRepository
import com.example.feature.home.impl.data.datasource.db.filmDatabase.Film
import com.example.feature.home.impl.data.datasource.db.filmDatabase.FilmDatabase
import com.example.feature.home.impl.data.datasource.memory.Movie
import com.example.feature.home.impl.data.datasource.remote.ApiService

class MovieRepositoryImpl(
    private val apiService: ApiService,
    private val filmDatabase: FilmDatabase
): MovieRepository {
    override suspend fun getMovies(): List<Movie> {
        return  apiService.loadMovies().docs.map {
            Movie(
                it.countries,
                it.description,
                it.genres,
                it.id,
                it.name,
                it.poster,
                it.year
            )
        }
    }
    override suspend fun insert(film: Film) {
        filmDatabase.filmDao().insert(film)
    }
    override suspend fun delete(id: Int){
        filmDatabase.filmDao().delete(id)
    }
    override suspend fun getById(id: Int){
        filmDatabase.filmDao().getFilmById(id)
    }
}
