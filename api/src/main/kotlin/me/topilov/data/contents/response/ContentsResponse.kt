package me.topilov.data.contents.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import convertValueToList
import mapper
import me.topilov.data.SystemInfo
import me.topilov.data.contents.ContentsLinks
import me.topilov.data.user.User
import me.topilov.data.user.UsersLinks

data class ContentsResponse(
    @JsonProperty("data") val dataJson: JsonNode,
    @JsonProperty("data_total") val dataTotal: Int,
    @JsonProperty("links") val links: ContentsLinks,
    @JsonProperty("user") val user: User,
    @JsonProperty("system_info") val systemInfo: SystemInfo,
) {

    inline fun <reified T> getDataOfType() = mapper.convertValueToList<T>(dataJson)
}
