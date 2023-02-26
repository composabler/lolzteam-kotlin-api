package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ForumPermissions(
    @JsonProperty("view") val view: Boolean = false,
    @JsonProperty("edit") val edit: Boolean = false,
    @JsonProperty("delete") val delete: Boolean = false,
    @JsonProperty("create_thread") val createThread: Boolean = false,
    @JsonProperty("upload_attachment") val uploadAttachment: Boolean = false,
    @JsonProperty("tag_thread") val tagThread: Boolean = false,
    @JsonProperty("follow") val follow: Boolean = false,
)
