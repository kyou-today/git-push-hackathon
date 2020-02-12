package dev.kyou.today.yourlist.entity

data class PageInfo(
    val totalResults: Int,
    val resultsPerPage: Int
)

data class Thumbnail(
    val url: String,
    val width: Int,
    val height: Int
)

data class Status(
    val privacyStatus: PrivacyStatus
)

enum class PrivacyStatus {
    PUBLIC,
    PRIVATE
}