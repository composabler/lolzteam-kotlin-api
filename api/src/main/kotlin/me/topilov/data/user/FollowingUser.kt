package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.deserializer.MapDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
data class FollowingUser(
    @JsonProperty("content_type") val contentType: String = "null",
    @JsonProperty("content_id") val contendId: String = "null",
    @JsonProperty("follow_date") val followDate: Long = -1,
    @JsonProperty("user_id") val id: Int = -1,
    @JsonProperty("username") val username: String = "null",
    @JsonProperty("user_message_count") val messages: Int = -1,
    @JsonProperty("user_register_date") val registerDate: Long = -1,
    @JsonProperty("user_like_count") val likes: Int = -1,
    @JsonProperty("short_link") val shortLink: String = "null",
    @JsonProperty("user_title") val title: String = "null",
    @JsonProperty("user_is_valid") val isValid: Boolean = false,
    @JsonProperty("user_is_verified") val isVerified: Boolean = false,
    @JsonProperty("user_is_followed") val isFollowed: Boolean = false,
    @JsonProperty("user_is_ignored") val isIgnored: Boolean = false,
    @JsonProperty("user_is_visitor") val isVisitor: Boolean = false,
    @JsonProperty("user_last_seen_date") val lastSeenDate: Long = -1,
    @JsonProperty("links") val links: UserLinks = UserLinks(),
    @JsonProperty("permissions") val permissions: UserPermissions = UserPermissions(),
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("custom_fields") val customFields: Map<String, Any> = emptyMap(),
)
