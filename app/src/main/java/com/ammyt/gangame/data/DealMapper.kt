package com.ammyt.gangame.data

import com.ammyt.gangamesdk.Deal

/**
 * Created by ammyt on 25/10/17.
 */
object DealMapper {

    fun fromSdk(deal: Deal): com.ammyt.gangame.Deal {
        return com.ammyt.gangame.Deal(
                deal.title,
                deal.salePrice,
                deal.normalPrice,
                deal.metacritic,
                deal.steamRating,
                deal.thumb)
    }
}