package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserExternalAuthentication(
    @JsonProperty("provider") val provider: String = "null",
    @JsonProperty("provider_key") val providerKey: String = "null",
)
