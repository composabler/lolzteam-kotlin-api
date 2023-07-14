package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.deserializer.MapDeserializer

data class FollowingUser(
    @JsonProperty("content_type") val contentType: String,
    @JsonProperty("content_id") val contendId: String,
    @JsonProperty("follow_date") val followDate: Long,
    @JsonProperty("user_id") val id: Int,
    @JsonProperty("username") val username: String,
    @JsonProperty("user_message_count") val messages: Int,
    @JsonProperty("user_register_date") val registerDate: Long,
    @JsonProperty("user_like_count") val likes: Int,
    @JsonProperty("short_link") val shortLink: String,
    @JsonProperty("user_title") val title: String,
    @JsonProperty("user_is_valid") val isValid: Boolean,
    @JsonProperty("user_is_verified") val isVerified: Boolean,
    @JsonProperty("user_is_followed") val isFollowed: Boolean,
    @JsonProperty("user_is_ignored") val isIgnored: Boolean,
    @JsonProperty("user_is_visitor") val isVisitor: Boolean,
    @JsonProperty("user_last_seen_date") val lastSeenDate: Long,
    @JsonProperty("links") val links: UserLinks?,
    @JsonProperty("permissions") val permissions: UserPermissions,
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("custom_fields") val customFields: Map<String, Any> = emptyMap(),
)
