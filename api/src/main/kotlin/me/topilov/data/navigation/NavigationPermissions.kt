package me.topilov.data.navigation

import com.fasterxml.jackson.annotation.JsonProperty

data class NavigationPermissions(
    @JsonProperty("create_thread") val createThread: Boolean,
    @JsonProperty("delete") val delete: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("follow") val follow: Boolean,
    @JsonProperty("tag_thread") val tagThread: Boolean,
    @JsonProperty("upload_attachment") val uploadAttachment: Boolean,
    @JsonProperty("view") val view: Boolean
)