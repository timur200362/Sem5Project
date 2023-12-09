package com.example.core.data.firstResponse

import com.google.gson.annotations.SerializedName

data class ReleaseYear(
    @SerializedName("end")
    val end: Int,
    @SerializedName("start")
    val start: Int
)