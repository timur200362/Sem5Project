package com.example.feature.home.impl.data.datasource.db.filmDatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.feature.home.impl.data.datasource.memory.Doc
import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse

@Dao
interface FilmDao {
    @Insert
    suspend fun insertAll(film: Film)

    @Delete
    suspend fun delete(film: Film)

    @Query("SELECT * FROM Film")
    suspend fun getAll(): List<Film>

    @Query("SELECT * FROM Film WHERE filmId=:id")
    suspend fun getDetailById(id: Int): Film
}