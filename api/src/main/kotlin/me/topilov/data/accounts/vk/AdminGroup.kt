package me.topilov.data.accounts.vk

import com.fasterxml.jackson.annotation.JsonProperty

data class AdminGroup(
    @JsonProperty("members_count") val members: Int,
    @JsonProperty("name") val name: String,
    @JsonProperty("screen_name") val screenName: String,
    @JsonProperty("admin_level") val adminLevel: Int,
    @JsonProperty("photo_100") val photo: String,
    @JsonProperty("title") val title: String,
    @JsonProperty("adminLevelPhrase") val adminLevelPhrase: String,
)