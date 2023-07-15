package me.topilov.data.thread

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.forum.Forum
import me.topilov.data.post.Post
import me.topilov.deserializer.MapDeserializer

data class Thread(
    @JsonProperty("thread_id") val id: Int,
    @JsonProperty("forum_id") val forumId: Int,
    @JsonProperty("thread_title") val title: String,
    @JsonProperty("thread_view_count") val views: Int,
    @JsonProperty("creator_user_id") val creatorUserId: Int,
    @JsonProperty("creator_username") val creatorUsername: String,
    @JsonProperty("thread_create_date") val createDate: Long,
    @JsonProperty("thread_update_date") val updateDate: Long,
    @JsonProperty("user_is_ignored") val userIsIgnored: Boolean,
    @JsonProperty("thread_post_count") val posts: Int,
    @JsonProperty("thread_is_published") val isPublished: Boolean,
    @JsonProperty("thread_is_deleted") val isDeleted: Boolean,
    @JsonProperty("thread_is_sticky") val isSticky: Boolean,
    @JsonProperty("thread_is_followed") val isFollowed: Boolean,
    @JsonProperty("first_post") val firstPost: Post,
    @JsonProperty("thread_prefixes") val prefixes: List<ThreadPrefix> = emptyList(),
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("thread_tags") val tags: Map<String, String>,
    @JsonProperty("links") val links: ThreadLinks,
    @JsonProperty("permissions") val permissions: ThreadPermissions,
    @JsonProperty("forum") val forum: Forum?,
    @JsonProperty("follow") val follow: ThreadFollow?,
)
