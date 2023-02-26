package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserPermissions(
    @JsonProperty("edit") val edit: Boolean = true,
    @JsonProperty("follow") val follow: Boolean = true,
    @JsonProperty("ignore") val ignore: Boolean = true,
    @JsonProperty("profile_post") val profilePost: Boolean = true,
)
