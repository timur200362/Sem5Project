package com.example.feature.home.impl.data.datasource.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(entities = [Film::class], version = 3)
//abstract class FilmDatabase : RoomDatabase() {
//    abstract fun filmDao(): FilmDao
//
//    companion object {
//        @Volatile
//        private var Instance: FilmDatabase? = null
//        fun getDatabase(context: Context): FilmDatabase {
//            val tempInstance = Instance
//            if (tempInstance != null) return tempInstance
//            synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    FilmDatabase::class.java,
//                    "app_database"
//                ).fallbackToDestructiveMigration().build()
//                Instance = instance
//                return instance
//            }
//        }
//    }
//}