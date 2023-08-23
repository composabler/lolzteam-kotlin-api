package me.topilov.data.accounts

import com.fasterxml.jackson.annotation.JsonProperty

data class Reserve(
    @JsonProperty("reserve_user_id") val userId: Int,
    @JsonProperty("reserve_date") val date: Long,
)
