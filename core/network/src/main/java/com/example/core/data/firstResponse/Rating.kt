package com.example.core.data.firstResponse

import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("kp")
    val kp: Double
)