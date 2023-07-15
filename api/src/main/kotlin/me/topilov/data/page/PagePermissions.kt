package me.topilov.data.page

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PagePermissions(
    @JsonProperty("view") val view: Boolean = false,
    @JsonProperty("edit") val edit: Boolean = false,
    @JsonProperty("delete") val delete: Boolean = false,
)
