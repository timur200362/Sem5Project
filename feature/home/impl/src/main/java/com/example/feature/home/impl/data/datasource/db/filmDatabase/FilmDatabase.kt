package com.example.feature.home.impl.data.datasource.db.filmDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.feature.home.impl.data.datasource.db.converters.CountryConverter
import com.example.feature.home.impl.data.datasource.db.converters.GenreConverter
import com.example.feature.home.impl.data.datasource.db.converters.ListConverter
import com.example.feature.home.impl.data.datasource.db.converters.PosterConverter

@Database(
    entities = [Film::class],
    version = 1,
    autoMigrations = [

    ])
@TypeConverters(CountryConverter::class, GenreConverter::class, PosterConverter::class, ListConverter::class)
abstract class FilmDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
    companion object {
        @Volatile
        private var INSTANCE: FilmDatabase? = null

        fun getInstance(context: Context): FilmDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FilmDatabase::class.java,
                    "film_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}