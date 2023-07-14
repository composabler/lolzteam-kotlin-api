package me.topilov.data.post.comment.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import me.topilov.data.SystemInfo
import me.topilov.data.post.comment.PostComment
import me.topilov.deserializer.MapDeserializer

data class PostCommentsResponse(
    @JsonDeserialize(using = MapDeserializer::class)
    @JsonProperty("comments") val comments: Map<String, PostComment> = emptyMap(),
    @JsonProperty("system_info") val systemInfo: SystemInfo,
)
