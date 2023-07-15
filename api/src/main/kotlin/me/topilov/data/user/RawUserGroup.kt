package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawUserGroup(
    @JsonProperty("user_group_id") val id: Int = -1,
    @JsonProperty("user_group_title") val title: String = "null",
)
