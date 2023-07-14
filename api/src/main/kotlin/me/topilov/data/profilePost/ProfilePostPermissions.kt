package me.topilov.data.profilePost

import com.fasterxml.jackson.annotation.JsonProperty

data class ProfilePostPermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("delete") val delete: Boolean,
    @JsonProperty("like") val like: Boolean,
    @JsonProperty("comment") val comment: Boolean,
    @JsonProperty("report") val report: Boolean,
)
