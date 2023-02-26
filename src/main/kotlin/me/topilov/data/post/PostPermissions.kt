package me.topilov.data.post

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PostPermissions(
    @JsonProperty("view") val view: Boolean = false,
    @JsonProperty("edit") val edit: Boolean = false,
    @JsonProperty("delete") val delete: Boolean = false,
    @JsonProperty("reply") val reply: Boolean = false,
    @JsonProperty("like") val like: Boolean = false,
    @JsonProperty("report") val report: Boolean = false,
    @JsonProperty("uploadAttachment") val uploadAttachment: Boolean = false,
)