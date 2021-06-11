package com.win95.mvvm.data.api

import com.win95.mvvm.data.vo.ItemData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Single

interface MovieDBInterface {
    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<ItemData>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id : Int): Single<ItemData>
}