package me.topilov.data.profilePost.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProfilePostCommentPermissions(
    @JsonProperty("view") val view: Boolean = false,
    @JsonProperty("delete") val delete: Boolean = false,
)
