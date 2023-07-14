package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserEditPermissions(
    @JsonProperty("password") val password: Boolean,
    @JsonProperty("user_email")val email: Boolean,
    @JsonProperty("username") val username: Boolean,
    @JsonProperty("user_title") val title: Boolean,
    @JsonProperty("primary_group_id") val primaryGroupId: Boolean,
    @JsonProperty("secondary_group_ids") val secondaryGroupIds: Boolean,
    @JsonProperty("user_dob_day") val dobDay: Boolean,
    @JsonProperty("user_dob_month") val dobMonth: Boolean,
    @JsonProperty("user_dob_year") val dobYear: Boolean,
    @JsonProperty("fields") val fields: Boolean,
)
