package me.topilov.data.category

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Category(
    @JsonProperty("category_id") val id: Int = -1,
    @JsonProperty("category_title") val title: String = "null",
    @JsonProperty("category_description") val description: String = "null",
    @JsonProperty("links") val links: CategoryLinks = CategoryLinks(),
    @JsonProperty("permissions") val permissions: CategoryPermissions = CategoryPermissions(),
)
