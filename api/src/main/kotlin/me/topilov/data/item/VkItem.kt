package me.topilov.data.item

import com.fasterxml.jackson.annotation.JsonProperty

data class VkItem(
    @JsonProperty("item_id") val id: Int,
    @JsonProperty("item_state") val state: ItemState,
    @JsonProperty("category_id") val categoryId: Int,
    @JsonProperty("published_date") val publishedDate: Long,
    @JsonProperty("title") val title: String,
    @JsonProperty("description") val description: String,
    @JsonProperty("price") val price: Int,
    @JsonProperty("update_stat_date") val updateStatDate: Long,
    @JsonProperty("refreshed_date") val refreshedDate: Long,
    @JsonProperty("view_count") val viewCount: Int,
    @JsonProperty("is_sticky") val isSticky: Boolean,
    @JsonProperty("item_origin") val origin: ItemOrigin,
    @JsonProperty("extended_guarantee") val extendedGuarantee: Boolean,
    @JsonProperty("nsb") val nsb: Int,
    @JsonProperty("allow_ask_discount") val allowAskDiscount: Boolean,
    @JsonProperty("title_en") val titleEn: String,
    @JsonProperty("description_en") val descriptionEn: String,
    @JsonProperty("email_type") val emailType: ItemEmailType,

)
