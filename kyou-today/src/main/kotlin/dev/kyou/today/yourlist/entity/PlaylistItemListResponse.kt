package dev.kyou.today.yourlist.entity

import kotlin.js.Date

data class PlaylistItemListResponse(
    val kind: String,
    val etag: String,
    val nextPageToken: String,
    val prevPageToken: String,
    val pageInfo: PageInfo,
    val items: List<Any>
)

data class PlaylistItemResource(
    val kind: String,
    val etag: String,
    val id: String,
    val snippet: PlaylistItemSnippet,
    val status: PrivacyStatus
)

data class PlaylistItemSnippet(
    val publishedAt: Date,
    val channelId: String,
    val title: String,
    val description: String,
    val thumbnails: Map<String, Thumbnail>,
    val channelTitle: String,
    val playlistId: String,
    val position: Int,
    val resourceId: VideoResourceId
)

data class VideoResourceId(
    val kind: String,
    val videoId: String
)