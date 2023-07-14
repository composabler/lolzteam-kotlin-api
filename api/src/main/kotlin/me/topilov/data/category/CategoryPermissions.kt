package me.topilov.data.category

import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryPermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("delete") val delete: Boolean,
)
