package me.topilov.data.profilePost.request

import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class LikeProfilePostRequest(
    val profilePostId: Int
) : BatchRequest(
    uri = "profile-posts/${profilePostId}/likes",
    method = HttpMethod.POST,
)