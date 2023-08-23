package me.topilov.service

import com.fasterxml.jackson.databind.JsonNode
import me.topilov.data.Result
import me.topilov.data.accounts.response.AccountsResponse
import me.topilov.data.batch.BatchRequest
import me.topilov.data.batch.BatchResponse
import me.topilov.data.proxy.response.ProxyResponse
import retrofit2.http.*

interface MarketApiService {

    @POST("/batch")
    suspend fun executeBatch(@Body batchRequest: List<@JvmSuppressWildcards BatchRequest>): BatchResponse

    @GET("/")
    suspend fun getLatestAccounts(): AccountsResponse

    @GET("/{categoryName}")
    suspend fun getCategoryAccounts(
        @Path("categoryName") categoryName: String,
        @Query("pmin") minPrice: Int? = null,
        @Query("pmax") maxPrice: Int? = null,
        @Query("title") title: String? = null,
        @Query("parse_sticky_items") parseStickyItems: Boolean? = null,
        @Query("parse_same_items") parseSameItems: Boolean? = null,
        @Query("game") game: List<Int>? = null,
        @Query("page") page: Int? = null,
        @QueryMap optionalCategoryParameters: Map<String, String> = emptyMap(),
    ): AccountsResponse

    // https://github.com/NztForum/Lolzteam-Public-API/blob/master/docs/market_api.markdown#get-useruseriditems

    // https://github.com/NztForum/Lolzteam-Public-API/blob/master/docs/market_api.markdown#get-useruseridorders

    @GET("/fave")
    suspend fun getFavoriteAccounts(): AccountsResponse

    @GET("/{itemId}")
    suspend fun getAccount(
        @Path("itemId") itemId: Int
    ): JsonNode

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
    suspend fun getProxy(): ProxyResponse

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