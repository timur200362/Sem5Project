package com.example.feature.home.impl.data.datasource.db.di

import androidx.room.Room
import com.example.feature.home.impl.data.datasource.db.filmDatabase.FilmDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val roomModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            FilmDatabase::class.java,
            "film_database"
        )
            .build()
    }
    single { get<FilmDatabase>().filmDao() }
}
