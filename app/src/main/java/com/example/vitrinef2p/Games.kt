package com.example.vitrinef2p

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Games (
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("thumbnail")
    val thumbnail: String? = null,
    @SerializedName("game_url")
    val game_url: String? = null,
    @SerializedName("genre")
    val genre: String? = null,
    @SerializedName("platform")
    val platform: String? = null,
    @SerializedName("publisher")
    val publisher: String? = null,
    @SerializedName("developer")
    val developer: String? = null,
    @SerializedName("release_date")
    val release_date: String? = null,
    @SerializedName("freetogame_profile_url")
    val freetogame_profile_url: String? = null
): Parcelable