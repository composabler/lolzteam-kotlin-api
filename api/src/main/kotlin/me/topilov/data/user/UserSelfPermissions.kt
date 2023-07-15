package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

data class UserSelfPermissions(
    @JsonProperty("create_conversation") val createConversation: Boolean,
    @JsonProperty("upload_attachment_conversation") val uploadAttachmentConversation: Boolean,
)
