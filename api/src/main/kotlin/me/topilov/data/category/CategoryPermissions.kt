package me.topilov.data.category

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class CategoryPermissions(
    @JsonProperty("view") val view: Boolean = false,
    @JsonProperty("edit") val edit: Boolean = false,
    @JsonProperty("delete") val delete: Boolean = false,
)
