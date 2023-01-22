package com.example.vitrinef2p

import retrofit2.Call
import retrofit2.http.GET

interface Api {

    companion object {
        const val BASE_URL = "https://www.freetogame.com"
    }

    @GET("/api/games")
    fun getGames(): Call<List<Games>>
}