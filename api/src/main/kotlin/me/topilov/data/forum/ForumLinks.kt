package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForumLinks(
    @JsonProperty("permalink") val permalink: String = "null",
    @JsonProperty("detail") val detail: String = "null",
    @JsonProperty("sub-categories") val subCategories: String = "null",
    @JsonProperty("sub-forums") val subForums: String = "null",
    @JsonProperty("threads") val threads: String = "null",
    @JsonProperty("followers") val followers: String = "null",
)
