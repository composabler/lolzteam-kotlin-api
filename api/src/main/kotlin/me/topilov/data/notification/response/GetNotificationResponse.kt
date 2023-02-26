package me.topilov.data.notification.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.SystemInfo
import me.topilov.data.notification.Notification
import me.topilov.data.post.Post
import me.topilov.data.user.User

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetNotificationResponse(
    @JsonProperty("user") val user: User? = null,
    @JsonProperty("posts") val posts: List<Post> = emptyList(),
    @JsonProperty("thread") val thread: Thread? = null,
    @JsonProperty("posts_total") val postsTotal: Int = -1,
    @JsonProperty("page_of_post_id") val pagePostId: Int = -1,
    @JsonProperty("notification") val notification: Notification? = null,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
