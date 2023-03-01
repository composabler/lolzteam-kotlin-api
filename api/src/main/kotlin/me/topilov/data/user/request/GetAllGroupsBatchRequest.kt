package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

class GetAllGroupsBatchRequest : BatchRequest(
    uri = "users/groups",
    method = HttpMethod.GET,
)