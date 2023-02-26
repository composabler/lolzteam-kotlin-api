package me.topilov.data.profilePost

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProfilePostPermissions(
    @JsonProperty("view") val view: Boolean = false,
    @JsonProperty("edit") val edit: Boolean = false,
    @JsonProperty("delete") val delete: Boolean = false,
    @JsonProperty("like") val like: Boolean = false,
    @JsonProperty("comment") val comment: Boolean = false,
    @JsonProperty("report") val report: Boolean = false,
)
