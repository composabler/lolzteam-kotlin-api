package me.topilov.data.accounts

import com.fasterxml.jackson.annotation.JsonProperty

data class BumpSettings(
    @JsonProperty("canBumpItem") val canBumpItem: Boolean,
    @JsonProperty("canBumpItemGlobally") val canBumpItemGlobally: Boolean,
    @JsonProperty("shortErrorPhrase") val shortErrorPhrase: String?,
    @JsonProperty("errorPhrase") val errorPhrase: String?,
)