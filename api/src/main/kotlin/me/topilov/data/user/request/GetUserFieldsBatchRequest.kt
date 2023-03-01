package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

class GetUserFieldsBatchRequest : BatchRequest(
    uri = "users/fields",
    method = HttpMethod.GET,
)