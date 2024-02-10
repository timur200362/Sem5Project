package com.example.feature.homedetail.impl.data.datasource.memory


import com.google.gson.annotations.SerializedName

data class Backdrop(
    @SerializedName("previewUrl")
    val previewUrl: String?,
    @SerializedName("url")
    val url: String?
)