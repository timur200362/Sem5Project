package com.example.feature.home.impl.data.datasource.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.io.Serial

@Serializable
internal data class TestResponse (
    @SerialName("name")
    val name:String?
)