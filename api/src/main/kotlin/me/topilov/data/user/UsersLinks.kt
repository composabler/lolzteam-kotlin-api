package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class UsersLinks(
    @JsonProperty("pages") val pages: Int,
    @JsonProperty("page") val page: Int,
    @JsonProperty("next") val next: String,
)
