package me.topilov.data.user.request

import me.topilov.data.batch.BatchRequest

class MyUserBatchRequest : BatchRequest(
    uri = "users/me"
)