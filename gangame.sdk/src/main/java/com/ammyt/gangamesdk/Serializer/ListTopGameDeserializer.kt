package com.ammyt.gangamesdk.Serializer

import com.ammyt.gangamesdk.TopGame
import com.google.gson.*
import java.lang.reflect.Type

/**
 * Created by ammyt on 25/10/17.
 */

class ListTopGameDeserializer : JsonDeserializer<ArrayList<TopGame>> {

    override fun deserialize(json: JsonElement,
                             typeOfT: Type?,
                             context: JsonDeserializationContext?): ArrayList<TopGame> {

        val jsonTopGames = json.asJsonObject
                .entrySet()
                .map { (key, jsonElement) ->
                    jsonElement.asJsonObject
                }

        val gson = GsonBuilder()
                .registerTypeAdapter(TopGame::class.java, TopGameDeserializer())
                .create()

        val listTopGames: List<TopGame> = jsonTopGames.map { json ->
            gson.fromJson(json, TopGame::class.java)
        }

        val arrayListTopGames: ArrayList<TopGame> = arrayListOf()
        arrayListTopGames.addAll(listTopGames)

        return arrayListTopGames
    }
}