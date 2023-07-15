package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class ThreadPermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("delete") val delete: Boolean,
    @JsonProperty("follow") val follow: Boolean,
    @JsonProperty("post") val post: Boolean,
    @JsonProperty("upload_attachment") val uploadAttachment: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("edit_title") val editTitle: Boolean,
    @JsonProperty("edit_tags") val editTags: Boolean,
)
