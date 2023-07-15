package me.topilov.data.user.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.user.User
import me.topilov.data.user.UsersLinks

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetUsersResponse(
    @JsonProperty("users") val users: List<User> = emptyList(),
    @JsonProperty("users_total") val total: Int = -1,
    @JsonProperty("links") val links: UsersLinks = UsersLinks(),
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
)
