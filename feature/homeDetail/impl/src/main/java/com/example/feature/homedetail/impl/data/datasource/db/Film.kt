package com.example.feature.homedetail.impl.data.datasource.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
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

//@Entity
//data class Film(
//    @PrimaryKey var filmId:Int,
//    @ColumnInfo(name = "image") var image: String?,
//    @ColumnInfo(name = "name") var name:String?,
//    @ColumnInfo(name = "year") var year:Int?,
//    @ColumnInfo(name = "description") var description:String?,
//
//    @Ignore
//    private val backdrop: Backdrop,
//    @Ignore
//    private val budget: Budget,
//    @Ignore
//    private val country: Country,
//    @Ignore
//    private val genre: Genre,
//    @Ignore
//    private val logo: Logo,
//    @Ignore
//    private val premiere: Premiere,
//    @Ignore
//    private val rating: Rating,
//    @Ignore
//    private val seasonsInfo:List<Any>,
//    @Ignore
//    private val spokenLanguage: SpokenLanguage,
//    @Ignore
//    private val videos: Videos,
//){
//    constructor() : this(
//        0,
//        Poster("","").toString(),
//        "",
//        0,
//        "",
//        Backdrop("",""),
//        Budget("", 0),
//        Country(""),
//        Genre(""),
//        Logo(""),
//        Premiere(""),
//        Rating(0.0),
//        listOf<Any>(),
//        SpokenLanguage(""),
//        Videos(listOf()))
//}
