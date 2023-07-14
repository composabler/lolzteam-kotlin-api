package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.deserializer.MapDeserializer

open class User(
    @JsonProperty("user_id") val id: Int,
    @JsonProperty("username") val username: String,
    @JsonProperty("user_title") val title: String,
    @JsonProperty("user_message_count") val messages: Int,
    @JsonProperty("user_register_date") val registerDate: Long,
    @JsonProperty("user_last_seen_date") val lastSeenDate: Long,
    @JsonProperty("user_like_count") val likes: Int,
    @JsonProperty("user_is_visitor") val isVisitor: Boolean,
    @JsonProperty("user_email") val email: String,
    @JsonProperty("user_dob_day") val birthDay: Int,
    @JsonProperty("user_dob_month") val birthMonth: Int,
    @JsonProperty("user_dob_year") val birthYear: Int,
    @JsonProperty("user_timezone_offset") val timeZoneOffset: Int,
    @JsonProperty("user_has_password") val hasPassword: Boolean,
    @JsonProperty("user_unread_conversation_count") val unreadConversations: Int,
    @JsonProperty("user_followers_total") val followers: Int,
    @JsonProperty("user_followings_total") val followings: Int,
    @JsonProperty("user_is_admin") val isAdmin: Boolean,
    @JsonProperty("user_is_moderator") val isModerator: Boolean,
    @JsonProperty("user_is_staff") val isStaff: Boolean,
    @JsonProperty("user_is_valid") val isValid: Boolean,
    @JsonProperty("user_is_verified") val isVerified: Boolean,
    @JsonProperty("user_is_followed") val isFollowed: Boolean,
    @JsonProperty("user_is_ignored") val isIgnored: Boolean,
    @JsonProperty("links") val links: UserLinks?,
    @JsonProperty("permissions") val permissions: UserPermissions,
    @JsonProperty("fields") val fields: List<UserField> = emptyList(),
    @JsonProperty("user_groups") val groups: List<UserGroup> = emptyList(),
    @JsonProperty("user_external_authentications") val externalAuths: List<UserExternalAuthentication> = emptyList(),
    @JsonProperty("self_permissions") val selfPermissions: UserSelfPermissions,
    @JsonProperty("edit_permissions") val editPermissions: UserEditPermissions,
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("custom_fields") val customFields: Map<String, Any> = emptyMap(),
)
