package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawUser(
    @JsonProperty("user_id") val id: Int = -1,
    @JsonProperty("username") val username: String = "null",
)
