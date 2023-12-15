package com.example.feature.home.impl.data.datasource.memory

import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("kp")
    val kp: Double
)