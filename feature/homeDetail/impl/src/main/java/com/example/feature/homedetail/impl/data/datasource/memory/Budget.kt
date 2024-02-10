package com.example.feature.homedetail.impl.data.datasource.memory


import com.google.gson.annotations.SerializedName

data class Budget(
    @SerializedName("currency")
    val currency: String?,
    @SerializedName("value")
    val value: Int?
)