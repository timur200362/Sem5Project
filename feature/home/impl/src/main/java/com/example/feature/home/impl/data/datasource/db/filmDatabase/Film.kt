package com.example.feature.home.impl.data.datasource.db.filmDatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Film(
    @PrimaryKey(autoGenerate = true) val filmId:Int?,
    @ColumnInfo(name = "countries") val countries: List<String?>,
    @ColumnInfo(name = "description") val description:String?,
    @ColumnInfo(name = "genres") val genres:List<String?>,
    @ColumnInfo(name = "id") val id:Int?,
    @ColumnInfo(name = "name") val name:String?,
    @ColumnInfo(name = "poster") val poster: String?,
    @ColumnInfo(name = "year") val year:Int?
)