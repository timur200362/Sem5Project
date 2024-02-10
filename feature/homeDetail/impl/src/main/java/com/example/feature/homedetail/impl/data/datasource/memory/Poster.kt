package com.example.feature.homedetail.impl.data.datasource.memory


import com.google.gson.annotations.SerializedName

data class Poster(
    @SerializedName("previewUrl")
    val previewUrl: String?,
    @SerializedName("url")
    val url: String?
)