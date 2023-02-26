package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.deserializer.MapDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
data class User(
    @JsonProperty("user_id") val id: Int = -1,
    @JsonProperty("username") val username: String = "null",
    @JsonProperty("user_title") val title: String = "null",
    @JsonProperty("user_message_count") val messages: Int = -1,
    @JsonProperty("user_register_date") val registerDate: Long = -1,
    @JsonProperty("user_last_seen_date") val lastSeenDate: Long = -1,
    @JsonProperty("user_like_count") val likes: Int = -1,
    @JsonProperty("user_is_visitor") val isVisitor: Boolean = false,
    @JsonProperty("user_email") val email: String = "null",
    @JsonProperty("user_dob_day") val birthDay: Int = -1,
    @JsonProperty("user_dob_month") val birthMonth: Int = -1,
    @JsonProperty("user_dob_year") val birthYear: Int = -1,
    @JsonProperty("user_timezone_offset") val timeZoneOffset: Int = -1,
    @JsonProperty("user_has_password") val hasPassword: Boolean = false,
    @JsonProperty("user_unread_conversation_count") val unreadConversations: Int = -1,
    @JsonProperty("user_followers_total") val followers: Int = -1,
    @JsonProperty("user_followings_total") val followings: Int = -1,
    @JsonProperty("user_is_admin") val isAdmin: Boolean = false,
    @JsonProperty("user_is_moderator") val isModerator: Boolean = false,
    @JsonProperty("user_is_staff") val isStaff: Boolean = false,
    @JsonProperty("user_is_valid") val isValid: Boolean = false,
    @JsonProperty("user_is_verified") val isVerified: Boolean = false,
    @JsonProperty("user_is_followed") val isFollowed: Boolean = false,
    @JsonProperty("user_is_ignored") val isIgnored: Boolean = false,
    @JsonProperty("links") val links: UserLinks = UserLinks(),
    @JsonProperty("permissions") val permissions: UserPermissions = UserPermissions(),
    @JsonProperty("fields") val fields: List<UserField> = listOf(),
    @JsonProperty("user_groups") val groups: List<UserGroup> = emptyList(),
    @JsonProperty("user_external_authentications") val externalAuths: List<UserExternalAuthentication> = emptyList(),
    @JsonProperty("self_permissions") val selfPermissions: UserSelfPermissions = UserSelfPermissions(),
    @JsonProperty("edit_permissions") val editPermissions: UserEditPermissions = UserEditPermissions(),
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("custom_fields") val customFields: Map<String, Any> = emptyMap(),
)
