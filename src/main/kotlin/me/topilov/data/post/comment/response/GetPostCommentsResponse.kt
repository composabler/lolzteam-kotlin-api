package me.topilov.data.post.comment.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.SystemInfo
import me.topilov.data.post.comment.PostComment
import me.topilov.deserializer.MapDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetPostCommentsResponse(
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("comments") val comments: Map<String, PostComment> = emptyMap(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
