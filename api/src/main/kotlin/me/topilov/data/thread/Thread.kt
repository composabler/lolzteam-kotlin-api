package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.forum.Forum
import me.topilov.data.post.Post
import me.topilov.deserializer.MapDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
data class Thread(
    @JsonProperty("thread_id") val id: Int = -1,
    @JsonProperty("forum_id") val forumId: Int = -1,
    @JsonProperty("thread_title") val title: String = "null",
    @JsonProperty("thread_view_count") val views: Int = -1,
    @JsonProperty("creator_user_id") val creatorUserId: Int = -1,
    @JsonProperty("creator_username") val creatorUsername: String = "null",
    @JsonProperty("thread_create_date") val createDate: Long = -1,
    @JsonProperty("thread_update_date") val updateDate: Long = -1,
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean = false,
    @JsonProperty("thread_post_count") val posts: Int = -1,
    @JsonProperty("thread_is_published") val isPublished: Boolean = false,
    @JsonProperty("thread_is_deleted") val isDeleted: Boolean = false,
    @JsonProperty("thread_is_sticky") val isSticky: Boolean = false,
    @JsonProperty("thread_is_followed") val isFollowed: Boolean = false,
    @JsonProperty("first_post") val firstPost: Post? = null,
    @JsonProperty("thread_prefixes") val prefixes: List<ThreadPrefix> = emptyList(),
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("thread_tags") val tags: Map<String, String> = emptyMap(),
    @JsonProperty("links") val links: ThreadLinks = ThreadLinks(),
    @JsonProperty("permissions") val permissions: ThreadPermissions = ThreadPermissions(),
    @JsonProperty("forum") val forum: Forum = Forum(),
    @JsonProperty("follow") val follow: ThreadFollow = ThreadFollow(),
)
