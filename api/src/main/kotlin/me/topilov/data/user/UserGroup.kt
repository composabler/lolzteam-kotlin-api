package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserGroup(
    @JsonProperty("user_group_id") val id: Int,
    @JsonProperty("user_group_title") val title: String,
    @JsonProperty("is_primary_group") val isPrimary: Boolean,
)