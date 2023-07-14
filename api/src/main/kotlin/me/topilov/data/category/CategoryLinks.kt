package me.topilov.data.category

import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryLinks(
    @JsonProperty("permalink") val permalink: String,
    @JsonProperty("detail") val detail: String,
    @JsonProperty("sub-categories") val subCategories: String,
    @JsonProperty("sub-forums") val subForums: String,
)
