package com.example.feature.home.impl.data.datasource.remote.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class TestBody(
    @SerialName("id")
    val id:Int
)
