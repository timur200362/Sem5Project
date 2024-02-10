package com.example.feature.homedetail.impl.data.datasource.remote.response


import com.example.feature.homedetail.impl.data.datasource.memory.Backdrop
import com.example.feature.homedetail.impl.data.datasource.memory.Budget
import com.example.feature.homedetail.impl.data.datasource.memory.Country
import com.example.feature.homedetail.impl.data.datasource.memory.Genre
import com.example.feature.homedetail.impl.data.datasource.memory.Logo
import com.example.feature.homedetail.impl.data.datasource.memory.Poster
import com.example.feature.homedetail.impl.data.datasource.memory.Premiere
import com.example.feature.homedetail.impl.data.datasource.memory.Rating
import com.example.feature.homedetail.impl.data.datasource.memory.SpokenLanguage
import com.example.feature.homedetail.impl.data.datasource.memory.Videos
import com.google.gson.annotations.SerializedName

data class DetailMovieByIdResponse(
    @SerializedName("ageRating")
    val ageRating: Int?,
    @SerializedName("alternativeName")
    val alternativeName: String?,
    @SerializedName("backdrop")
    val backdrop: Backdrop?,
    @SerializedName("budget")
    val budget: Budget?,
    @SerializedName("countries")
    val countries: List<Country?>?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("genres")
    val genres: List<Genre?>?,
    @SerializedName("id")
    val id: Int?,
//    @SerializedName("lists")
//    val lists: List<String?>?,
    @SerializedName("logo")
    val logo: Logo?,
    @SerializedName("movieLength")
    val movieLength: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("poster")
    val poster: Poster?,
    @SerializedName("premiere")
    val premiere: Premiere?,
    @SerializedName("rating")
    val rating: Rating?,
    @SerializedName("seasonsInfo")
    val seasonsInfo: List<Any?>?,
    @SerializedName("shortDescription")
    val shortDescription: String?,
    @SerializedName("slogan")
    val slogan: String?,
    @SerializedName("spokenLanguages")
    val spokenLanguages: List<SpokenLanguage?>?,
    @SerializedName("top250")
    val top250: Int?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("typeNumber")
    val typeNumber: Int?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("videos")
    val videos: Videos?,
    @SerializedName("year")
    val year: Int?
)