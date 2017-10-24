package com.ammyt.gangamesdk

import com.google.gson.annotations.SerializedName

/**
 * Created by ammyt on 24/10/17.
 */

data class Deal(
        var title: String,
        var salePrice: Float,
        var normalPrice: Float,
        @SerializedName("metacriticScore") var metacritic: Int,
        @SerializedName("steamRatingPercent") var steamRating: Int,
        var thumb: String
)

data class TopGame(
        @SerializedName("name") val title: String,
        val publisher: String,
        @SerializedName("score_rank") val steamRating: Int,
        val owners: Int,
        val price: Float,
        val thumb: String
)