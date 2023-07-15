package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import me.topilov.utils.HttpMethod
import retrofit2.http.QueryMap
import java.util.UUID

@JsonIgnoreProperties(ignoreUnknown = true)
open class BatchRequest(
    @JsonProperty("id") open val id: UUID = UUID.randomUUID(),
    @JsonProperty("uri") open val uri: String = "null",
    @JsonProperty("method") open val method: HttpMethod = HttpMethod.GET,
    @QueryMap @JsonProperty("params") open val params: Map<String, Any?> = emptyMap(),
)
