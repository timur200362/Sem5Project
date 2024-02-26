package com.example.feature.home.impl.data.datasource.db.converters

import androidx.room.TypeConverter
import com.example.feature.home.impl.data.datasource.memory.Poster

class PosterConverter {

    @TypeConverter
    fun fromPoster(poster: Poster?): String {
        return "${poster?.url}|${poster?.previewUrl}"
    }

    @TypeConverter
    fun toPoster(data: String?): Poster {
        val parts = data?.split("|")
        return Poster(parts?.get(0) ?: "null", parts?.get(1) ?: "null")
    }
}
