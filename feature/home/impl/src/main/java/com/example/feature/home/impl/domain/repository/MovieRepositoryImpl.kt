package com.example.feature.home.impl.domain.repository

import com.example.feature.home.impl.data.datasource.repository.MovieRepository
import com.example.feature.home.impl.data.datasource.db.filmDatabase.FilmDatabase
import com.example.feature.home.impl.data.datasource.db.filmDatabase.MovieDB
import com.example.feature.home.impl.data.datasource.memory.MovieUI
import com.example.feature.home.impl.data.datasource.remote.ApiService

class MovieRepositoryImpl(
    private val apiService: ApiService,
    private val filmDatabase: FilmDatabase
): MovieRepository {
    override suspend fun getMovies(): List<MovieUI> {
        return  apiService.loadMovies().docs.map {
            MovieUI(
                it.countries,
                it.description,
                it.genres,
                it.id,
                it.name,
                it.poster,
                it.year,
                false
            )
        }
    }
    override suspend fun insert(film: MovieDB) {
        filmDatabase.filmDao().insert(film)
    }
    override suspend fun delete(id: Int){
        filmDatabase.filmDao().delete(id)
    }
}
