package me.topilov.data.forum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Forum(
    @JsonProperty("forum_id") val id: Int = -1,
    @JsonProperty("forum_title") val title: String = "null",
    @JsonProperty("forum_description") val description: String = "null",
    @JsonProperty("forum_thread_count") val threads: Int = -1,
    @JsonProperty("forum_post_count") val posts: Int = -1,
    @JsonProperty("forum_prefixes") val prefixes: List<ForumPrefix> = emptyList(),
    @JsonProperty("thread_default_prefix_id") val threadDefaultPrefixId: Int = -1,
    @JsonProperty("thread_prefix_is_required") val threadPrefixIsRequired: Boolean = false,
    @JsonProperty("links") val links: ForumLinks = ForumLinks(),
    @JsonProperty("permissions") val permissions: ForumPermissions = ForumPermissions(),
    @JsonProperty("forum_is_followed") val isFollowed: Boolean = false,
    @JsonProperty("follow") val follow: ForumFollow? = null,
)
