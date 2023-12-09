package com.example.core.data.firstResponse

import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("name")
    val name: String
)