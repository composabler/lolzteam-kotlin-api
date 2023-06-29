package me.topilov.service

import com.fasterxml.jackson.databind.JsonNode
import me.topilov.data.Result
import me.topilov.data.batch.BatchRequest
import me.topilov.data.batch.BatchResponse
import me.topilov.data.proxy.response.GetProxyResponse
import okhttp3.Call
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.http.*

interface MarketApiService {

    @POST("/batch")
    suspend fun executeBatch(@Body batchRequest: List<@JvmSuppressWildcards BatchRequest>): BatchResponse

    @GET("me")
    suspend fun getMyUser(): JsonNode

    @PUT("me")
    suspend fun changeSettings(
        @Query("disable_steam_guard") disableSteamGuard: Boolean? = null,
        @Query("user_allow_ask_discount") userAllowAskDiscount: Boolean? = null,
        @Query("max_discount_percent") maxDiscountPercent: Int? = null,
        @Query("allow_accept_accounts") allowAcceptAccounts: String? = null,
        @Query("hide_favourites") hideFavourites: Boolean? = null,
    ): Result

    @GET("proxy")
    suspend fun getProxy(): GetProxyResponse

    @POST("proxy")
    suspend fun addSingleProxy(
        @Query("proxy_ip") proxyIp: String,
        @Query("proxy_port") proxyPort: Int,
        @Query("proxy_user") proxyUser: String,
        @Query("proxy_pass") proxyPassword: String,
    ): Result

    @POST("proxy")
    suspend fun addMultiProxy(
        @Query("proxy_row") proxyRow: String,
    ): Result

    @DELETE("proxy")
    suspend fun deleteProxy(
        @Query("proxy_id") proxyId: Int? = null,
        @Query("delete_all") deleteAll: Boolean? = null,
    ): Result
}