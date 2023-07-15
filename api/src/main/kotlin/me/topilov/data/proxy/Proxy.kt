package me.topilov.data.proxy

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class Proxy(
    @JsonProperty("proxy_id") val id: Int,
    @JsonProperty("user_id") val userId: Int,
    @JsonProperty("proxy_ip") val ip: String,
    @JsonProperty("proxy_port") val port: Int,
    @JsonProperty("proxy_user") val user: String,
    @JsonProperty("proxy_pass") val password: String,
    @JsonProperty("proxyString") val row: String,
)
