package com.example.feature.home.impl.data.datasource.db.converters

import androidx.room.TypeConverter
import com.example.feature.home.impl.data.datasource.memory.Country

class CountryConverter {
    @TypeConverter
    fun countryToString(country: Country?): String? {
        return country?.name
    }

    @TypeConverter
    fun stringToCountry(name: String?): Country? {
        return name?.let { Country(it) }
    }
}