package me.topilov.data.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.data.Choice

@JsonIgnoreProperties(ignoreUnknown = true)
data class UserField(
    @JsonProperty("id") val id: String = "null",
    @JsonProperty("title") val title: String = "null",
    @JsonProperty("description") val description: String = "null",
    @JsonProperty("position") val position: String = "null",
    @JsonProperty("is_required") val isRequired: Boolean = false,
    @JsonProperty("value") val value: String = "null",
    @JsonProperty("is_multi_choice") val isMultiChoice: Boolean = false,
    @JsonProperty("choices") val choices: List<Choice> = emptyList(),
)
