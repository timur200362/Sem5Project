package com.example.feature.homedetail.impl.data.datasource.memory


import com.google.gson.annotations.SerializedName

data class Videos(
    @SerializedName("trailers")
    val trailers: List<Trailer?>?
)