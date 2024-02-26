package com.example.feature.home.impl.data.datasource.db.converters

import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken

class ListConverter {
    @TypeConverter
    fun fromListToString(list: List<String>): String {
        return list.joinToString(",") { it }
    }

    @TypeConverter
    fun fromStringToList(value: String?): List<String> {
        return value?.split(",") ?: emptyList()
    }
}