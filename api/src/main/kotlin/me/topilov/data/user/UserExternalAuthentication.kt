package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty

data class UserExternalAuthentication(
    @JsonProperty("provider") val provider: String,
    @JsonProperty("provider_key") val providerKey: String,
)
