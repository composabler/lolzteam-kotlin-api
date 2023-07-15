package me.topilov.data.category

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class Category(
    @JsonProperty("category_id") val id: Int,
    @JsonProperty("category_title") val title: String,
    @JsonProperty("category_description") val description: String,
    @JsonProperty("links") val links: CategoryLinks,
    @JsonProperty("permissions") val permissions: CategoryPermissions,
)
