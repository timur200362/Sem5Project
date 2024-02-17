//package com.example.feature.homedetail.impl.data.datasource.db
//
//import androidx.room.Dao
//import androidx.room.Delete
//import androidx.room.Insert
//import androidx.room.Query
//import com.example.feature.homedetail.impl.data.datasource.remote.response.DetailMovieByIdResponse
//
//@Dao
//interface FilmDao {
//    @Insert
//    suspend fun insertAll(detailMovieByIdResponse: DetailMovieByIdResponse)
//
//    @Delete
//    suspend fun delete(detailMovieByIdResponse: DetailMovieByIdResponse)
//
//    @Query("SELECT * FROM Film")
//    suspend fun getAll(): List<DetailMovieByIdResponse>
//
//    @Query("SELECT * FROM Film WHERE filmId=:id")
//    suspend fun getDetailById(id: Int): DetailMovieByIdResponse
//}