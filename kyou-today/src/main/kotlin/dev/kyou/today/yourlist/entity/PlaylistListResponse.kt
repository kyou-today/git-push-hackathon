package dev.kyou.today.yourlist.entity

import kotlin.js.Date

data class ListPlaylistResponse(
    val kind: String,
    val etag: String,
    val nextPageToken: String,
    val prevPageToken: String,
    val pageInfo: PageInfo,
    val items: List<PlaylistResource>
)

data class PlaylistResource(
    val king: String,
    val etag: String,
    val id: String,
    val snippet: PlaylistSnippet,
    val status: Status
)

data class PlaylistSnippet(
    val publishedAt: Date? = null,
    val channelId: String? = null,
    val title: String,
    val description: String? = null,
    val thumbnails: Map<String, Thumbnail>? = null,
    val channelTitle: String? = null,
    val localized: LocalizedMessage? = null,
    val tags: List<String>? = null
)

data class LocalizedMessage(
    val title: String,
    val description: String
)