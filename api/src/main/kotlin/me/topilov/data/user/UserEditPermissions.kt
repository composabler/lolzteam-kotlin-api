package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserEditPermissions(
    @JsonProperty("password") val password: Boolean = false,
    @JsonProperty("user_email")val email: Boolean = false,
    @JsonProperty("username") val username: Boolean = false,
    @JsonProperty("user_title") val title: Boolean = false,
    @JsonProperty("primary_group_id") val primaryGroupId: Boolean = false,
    @JsonProperty("secondary_group_ids") val secondaryGroupIds: Boolean = false,
    @JsonProperty("user_dob_day") val dobDay: Boolean = false,
    @JsonProperty("user_dob_month") val dobMonth: Boolean = false,
    @JsonProperty("user_dob_year") val dobYear: Boolean = false,
    @JsonProperty("fields") val fields: Boolean = false,
)
