package com.example.feature.home.impl.data.datasource.db.filmDatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.feature.home.impl.data.datasource.db.converters.CountryConverter
import com.example.feature.home.impl.data.datasource.db.converters.GenreConverter
import com.example.feature.home.impl.data.datasource.db.converters.PosterConverter

@Database(
    entities = [Film::class],
    version = 1,
    autoMigrations = [

    ])
@TypeConverters(CountryConverter::class, GenreConverter::class, PosterConverter::class)
abstract class FilmDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
}