package com.ammyt.gangamesdk

import retrofit2.Retrofit

/**
 * Created by ammyt on 25/10/17.
 */
interface GangameApiConfig {

    fun setupConfig(builder: Retrofit.Builder)
}