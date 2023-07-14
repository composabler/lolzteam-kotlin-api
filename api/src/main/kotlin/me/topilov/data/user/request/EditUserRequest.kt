package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class EditUserRequest(
    val userId: Int,
    val password: String? = null,
    val passwordOld: String? = null,
    val passwordAlgo: String? = null,
    val userEmail: String? = null,
    val username: String? = null,
    val userTitle: String? = null,
    val primaryGroupId: Int? = null,
    val secondaryGroupIds: String? = null,
    val userDobDay: Int? = null,
    val userDobMonth: Int? = null,
    val userDobYear: Int? = null,
    val fields: String? = null
) : BatchRequest(
    uri = "users/${userId}",
    method = HttpMethod.PUT,
    params = mapOfNotNull(
        "password" to password,
        "password_old" to passwordOld,
        "password_algo" to passwordAlgo,
        "user_email" to userEmail,
        "username" to username,
        "user_title" to userTitle,
        "primary_group_id" to primaryGroupId,
        "secondary_group_ids" to secondaryGroupIds,
        "user_dob_day" to userDobDay,
        "user_dob_month" to userDobMonth,
        "user_dob_year" to userDobYear,
        "fields" to fields
    )
)