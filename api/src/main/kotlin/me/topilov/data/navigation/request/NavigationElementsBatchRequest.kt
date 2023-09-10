package me.topilov.data.navigation.request

import me.topilov.data.batch.BatchRequest

data class NavigationElementsBatchRequest(
    val threadId: Int,
) : BatchRequest(
    uri = "threads/${threadId}/navigation"
)