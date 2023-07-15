package me.topilov.data.profilePost.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.profilePost.ProfilePost

data class CreateProfilePostResponse(
    @JsonProperty("profile_post") val profilePost: ProfilePost?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
