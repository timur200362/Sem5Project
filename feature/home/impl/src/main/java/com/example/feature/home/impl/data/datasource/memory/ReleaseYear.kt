package com.example.feature.home.impl.data.datasource.memory

import com.google.gson.annotations.SerializedName

data class ReleaseYear(
    @SerializedName("end")
    val end: Int,
    @SerializedName("start")
    val start: Int
)