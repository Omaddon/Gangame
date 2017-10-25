package com.ammyt.gangame.data

import com.ammyt.gangame.TopGame

/**
 * Created by ammyt on 25/10/17.
 */
object TopGameMapper {

    fun fromSdk(topGame: com.ammyt.gangamesdk.TopGame,
                position: Int): TopGame {

        return TopGame(
                topGame.title,
                topGame.owners,
                topGame.steamRating,
                topGame.publisher,
                topGame.price,
                position,
                topGame.thumb
        )
    }
}