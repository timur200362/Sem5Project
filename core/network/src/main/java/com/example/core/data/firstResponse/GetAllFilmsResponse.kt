package com.example.core.data.firstResponse

import com.google.gson.annotations.SerializedName

data class GetAllFilmsResponse(
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