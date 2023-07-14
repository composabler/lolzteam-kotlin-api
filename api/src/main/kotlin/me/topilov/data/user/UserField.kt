package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.Choice

data class UserField(
    @JsonProperty("id") val id: String,
    @JsonProperty("title") val title: String,
    @JsonProperty("description") val description: String,
    @JsonProperty("position") val position: String,
    @JsonProperty("is_required") val isRequired: Boolean,
    @JsonProperty("value") val value: String,
    @JsonProperty("is_multi_choice") val isMultiChoice: Boolean,
    @JsonProperty("choices") val choices: List<Choice> = emptyList(),
)
