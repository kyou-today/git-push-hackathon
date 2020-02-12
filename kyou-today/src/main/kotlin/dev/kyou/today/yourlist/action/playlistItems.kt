package dev.kyou.today.yourlist.action

import dev.kyou.today.yourlist.entity.PlaylistItemResource
import redux.RAction

data class AddPlaylistItem(
    val resource: PlaylistItemResource
) : RAction

data class DeletePlaylistItem(
    val id: String
) : RAction