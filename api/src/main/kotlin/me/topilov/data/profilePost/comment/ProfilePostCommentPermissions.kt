package me.topilov.data.profilePost.comment

import com.fasterxml.jackson.annotation.JsonProperty

data class ProfilePostCommentPermissions(
    @JsonProperty("view") val view: Boolean,
    @JsonProperty("delete") val delete: Boolean,
)
