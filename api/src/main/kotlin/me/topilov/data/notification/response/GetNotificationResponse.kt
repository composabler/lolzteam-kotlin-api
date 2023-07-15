package me.topilov.data.notification.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.notification.Notification
import me.topilov.data.post.Post
import me.topilov.data.user.User

data class GetNotificationResponse(
    @JsonProperty("user") val user: User?,
    @JsonProperty("posts") val posts: List<Post> = emptyList(),
    @JsonProperty("thread") val thread: Thread?,
    @JsonProperty("posts_total") val postsTotal: Int,
    @JsonProperty("page_of_post_id") val pagePostId: Int,
    @JsonProperty("notification") val notification: Notification?,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
