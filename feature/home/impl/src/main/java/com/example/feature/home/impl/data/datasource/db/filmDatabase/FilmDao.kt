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
    suspend fun insert(film: Film)

    @Query("DELETE FROM Film WHERE id=:id")
    suspend fun delete(id: Int)

    @Query("SELECT * FROM Film WHERE favorite=1")
    suspend fun getAll(): List<Film>

    @Query("SELECT * FROM Film WHERE id=:id")
    suspend fun getFilmById(id: Int): Film
}