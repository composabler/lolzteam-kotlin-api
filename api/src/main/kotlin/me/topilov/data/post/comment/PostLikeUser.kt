package me.topilov.data.post.comment

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class PostLikeUser(
    @JsonProperty("user_id") val id: Int,
    @JsonProperty("username") val username: String,
    @JsonProperty("display_style_group_id") val displayStyleGroupId: Int,
    @JsonProperty("is_banned") val isBanned: Int,
    @JsonProperty("uniq_username_css") val uniqUsernameCss: String,
)
