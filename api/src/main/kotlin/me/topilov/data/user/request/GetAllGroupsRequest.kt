package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

class GetAllGroupsRequest : BatchRequest(
    uri = "users/groups",
    method = HttpMethod.GET,
)