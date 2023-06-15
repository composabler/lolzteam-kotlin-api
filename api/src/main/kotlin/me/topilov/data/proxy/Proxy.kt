package me.topilov.data.proxy

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Proxy(
    @JsonProperty("proxy_id") val id: Int = -1,
    @JsonProperty("user_id") val userId: Int = -1,
    @JsonProperty("proxy_ip") val ip: String = "null",
    @JsonProperty("proxy_port") val port: Int = -1,
    @JsonProperty("proxy_user") val user: String = "null",
    @JsonProperty("proxy_pass") val password: String = "null",
    @JsonProperty("proxyString") val row: String = "null",
)
