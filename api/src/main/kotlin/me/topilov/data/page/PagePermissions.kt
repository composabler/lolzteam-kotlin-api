package me.topilov.data.page

import com.fasterxml.jackson.annotation.JsonProperty

data class PagePermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("delete") val delete: Boolean,
)
