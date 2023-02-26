package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PostLikeUser(
    @JsonProperty("user_id") val id: Int = -1,
    @JsonProperty("username") val username: String = "null",
    @JsonProperty("display_style_group_id") val displayStyleGroupId: Int = -1,
    @JsonProperty("is_banned") val isBanned: Int = -1,
    @JsonProperty("uniq_username_css") val uniqUsernameCss: String = "null",
)
