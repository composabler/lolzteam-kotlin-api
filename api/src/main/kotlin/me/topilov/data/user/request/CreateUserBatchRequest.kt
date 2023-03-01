package me.topilov.data.user.request

import mapOfNotNull
import me.topilov.data.batch.BatchRequest
import me.topilov.utils.HttpMethod

data class CreateUserBatchRequest(
    override val id: String,
    val userEmail: String,
    val username: String,
    val password: String,
    val passwordAlgo: String? = null,
    val userDobDay: Int? = null,
    val userDobMonth: Int? = null,
    val userDobYear: Int? = null,
    val fields: String? = null,
    val clientId: Int? = null,
    val extraData: String? = null
) : BatchRequest(
    uri = "users",
    method = HttpMethod.POST,
    params = mapOfNotNull(
        "user_email" to userEmail,
        "username" to username,
        "password" to password,
        "password_algo" to passwordAlgo,
        "user_dob_day" to userDobDay,
        "user_dob_month" to userDobMonth,
        "user_dob_year" to userDobYear,
        "fields" to fields,
        "client_id" to clientId,
        "extra_data" to extraData
    )
)