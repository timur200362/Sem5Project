package com.example.feature.home.impl.data.datasource.memory

import com.google.gson.annotations.SerializedName

data class Poster(
    @SerializedName("previewUrl")
    val previewUrl: String,
    @SerializedName("url")
    val url: String
)