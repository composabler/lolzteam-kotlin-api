package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserPermissions(
    @JsonProperty("edit") val edit: Boolean,
    @JsonProperty("follow") val follow: Boolean,
    @JsonProperty("ignore") val ignore: Boolean,
    @JsonProperty("profile_post") val profilePost: Boolean,
)
