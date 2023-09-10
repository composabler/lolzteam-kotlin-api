package me.topilov.data.navigation

import com.fasterxml.jackson.annotation.JsonProperty

data class NavigationLinks(
    @JsonProperty("detail") val detail: String,
    @JsonProperty("followers") val followers: String,
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("sub-categories") val subCategories: String,
    @JsonProperty("sub-elements") val subElements: String,
    @JsonProperty("sub-forums") val subForums: String,
    @JsonProperty("threads") val threads: String
)