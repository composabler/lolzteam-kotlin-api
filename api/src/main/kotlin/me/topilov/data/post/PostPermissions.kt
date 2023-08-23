package me.topilov.data.post

import com.fasterxml.jackson.annotation.JsonProperty

data class PostPermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("delete") val delete: Boolean,
    @JsonProperty("reply") val reply: Boolean,
    @JsonProperty("like") val like: Boolean,
    @JsonProperty("report") val report: Boolean,
    @JsonProperty("uploadAttachment") val uploadAttachment: Boolean?,
)