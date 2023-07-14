package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonProperty

data class ForumPermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("delete") val delete: Boolean,
    @JsonProperty("create_thread") val createThread: Boolean,
    @JsonProperty("upload_attachment") val uploadAttachment: Boolean,
    @JsonProperty("tag_thread") val tagThread: Boolean,
    @JsonProperty("follow") val follow: Boolean,
)
