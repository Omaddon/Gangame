package com.ammyt.gangamesdk

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by ammyt on 24/10/17.
 */

interface RetrofitGangameApi {

    @GET(Routes.GET_DEALS)
    fun getDeals(): Call<ArrayList<Deal>>

    @GET(Routes.GET_TOP_100_GAMES)
    fun getTopRatedGames(): Call<ArrayList<TopGame>>

    @GET(Routes.GET_MOST_OWNED_GAMES)
    fun getMostOwnedGames(): Call<ArrayList<TopGame>>
}