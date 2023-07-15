package me.topilov.data.batch

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import mapper
import me.topilov.data.SystemInfo
import java.util.UUID

@JsonIgnoreProperties(ignoreUnknown = true)
data class BatchResponse(
    @JsonProperty("jobs") val jobs: Map<UUID, BatchResponseJob> = emptyMap(),
    @JsonProperty("system_info") val systemInfo: SystemInfo = SystemInfo(),
) {

    inline fun <reified T> getJob(id: UUID): T? {
        val job = jobs[id] ?: return null
        return mapper.convertValue(job.rawData, T::class.java)
    }
}
