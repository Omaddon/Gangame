package com.ammyt.gangame

/**
 * Created by ammyt on 24/10/17.
 */

data class Deal(var title: String,
                var salePrice: Float,
                var normalPrice: Float,
                var metacritic: Int,
                var steamRating: Int,
                var thumb: String)

data class TopGame(var title: String,
                   var owners: Int,
                   var steamRating: Int,
                   var publisher: String,
                   var price: Float,
                   var position: Int,
                   var thumb: String)