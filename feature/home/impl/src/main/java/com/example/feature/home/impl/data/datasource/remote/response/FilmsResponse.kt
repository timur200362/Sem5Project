package com.example.feature.home.impl.data.datasource.remote.response

import com.example.feature.home.impl.data.datasource.memory.Doc
import com.google.gson.annotations.SerializedName

data class FilmsResponse(
    @SerializedName("docs")
    val docs: List<Doc>,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("page")
    val page: Int,
    @SerializedName("pages")
    val pages: Int,
    //val total: Int
)