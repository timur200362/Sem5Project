package com.example.feature.home.impl.data.datasource.db.converters

import androidx.room.TypeConverter
import com.example.feature.home.impl.data.datasource.memory.Genre

class GenreConverter {
    @TypeConverter
    fun countryToString(genre: Genre?): String? {
        return genre?.name
    }

    @TypeConverter
    fun stringToCountry(name: String?): Genre? {
        return name?.let { Genre(it) }
    }
}