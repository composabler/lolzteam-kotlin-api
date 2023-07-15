package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserSelfPermissions(
    @JsonProperty("create_conversation") val createConversation: Boolean = false,
    @JsonProperty("upload_attachment_conversation") val uploadAttachmentConversation: Boolean = false,
)
