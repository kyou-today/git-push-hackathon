package dev.kyou.today.yourlist.action

import dev.kyou.today.yourlist.entity.PlaylistResource
import redux.RAction

data class AddPlaylist(
    val resource: PlaylistResource
) : RAction

data class DeletePlaylist(
    val id: String
) : RAction

data class RefreshPlaylist(
    val resources: List<PlaylistResource>
) : RAction