package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonProperty

data class Forum(
    @JsonProperty("forum_id") val id: Int,
    @JsonProperty("forum_title") val title: String,
    @JsonProperty("forum_description") val description: String,
    @JsonProperty("forum_thread_count") val threads: Int,
    @JsonProperty("forum_post_count") val posts: Int,
    @JsonProperty("forum_prefixes") val prefixes: List<ForumPrefix> = emptyList(),
    @JsonProperty("thread_default_prefix_id") val threadDefaultPrefixId: Int,
    @JsonProperty("thread_prefix_is_required") val threadPrefixIsRequired: Boolean,
    @JsonProperty("links") val links: ForumLinks,
    @JsonProperty("permissions") val permissions: ForumPermissions,
    @JsonProperty("forum_is_followed") val isFollowed: Boolean,
    @JsonProperty("follow") val follow: ForumFollow,
)
