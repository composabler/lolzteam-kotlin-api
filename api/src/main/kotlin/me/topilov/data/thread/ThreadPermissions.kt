package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ThreadPermissions(
    @JsonProperty("view") val view: Boolean = false,
    @JsonProperty("delete") val delete: Boolean = false,
    @JsonProperty("follow") val follow: Boolean = false,
    @JsonProperty("post") val post: Boolean = false,
    @JsonProperty("upload_attachment") val uploadAttachment: Boolean = false,
    @JsonProperty("edit") val edit: Boolean = false,
    @JsonProperty("edit_title") val editTitle: Boolean = false,
    @JsonProperty("edit_tags") val editTags: Boolean = false,
)
