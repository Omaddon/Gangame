package com.ammyt.gangamesdk

import com.ammyt.gangamesdk.Serializer.TopGameDeserializer
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by ammyt on 24/10/17.
 */
class GangameApiService {

    val apiClient: RetrofitGangameApi
    init {
        val gson = GsonBuilder()
                .registerTypeAdapter(TopGame::class.java, TopGameDeserializer())
                .create()

        val apiClientConfig =
                Retrofit.Builder()
                        .baseUrl(Routes.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build()

        apiClient = apiClientConfig.create(RetrofitGangameApi::class.java)
    }
}