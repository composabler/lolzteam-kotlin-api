package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class ForumLinks(
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("detail") val detail: String,
    @JsonProperty("sub-categories") val subCategories: String,
    @JsonProperty("sub-forums") val subForums: String,
    @JsonProperty("threads") val threads: String,
    @JsonProperty("followers") val followers: String,
)
