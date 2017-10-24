package com.ammyt.gangamesdk.Serializer

import com.ammyt.gangamesdk.TopGame
import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

/**
 * Created by ammyt on 24/10/17.
 */
class TopGameDeserializer : JsonDeserializer<TopGame> {

    companion object {
        const val BASE_IMG_URL = "http://cdn.akami.steamstatic.com/steam/apps/%s/capsule_184x69.jpg"
    }

    override fun deserialize(json: JsonElement,
                             typeOfT: Type?,
                             context: JsonDeserializationContext?): TopGame {

        val gson = Gson()

        val topGame = gson.fromJson(json, TopGame::class.java)
        val appId = json.asJsonObject["appid"].asInt.toString()
        val thumb = String.format(BASE_IMG_URL, appId)
        topGame.thumb = thumb

        return topGame
    }
}