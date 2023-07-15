package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PostCommentPermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("delete") val delete: Boolean,
    @JsonProperty("reply") val reply: Boolean,
    @JsonProperty("like") val like: Boolean,
    @JsonProperty("report") val report: Boolean,
)
