package dev.kyou.today.yourlist.reducer

import dev.kyou.today.yourlist.action.AddPlaylistItem
import dev.kyou.today.yourlist.action.DeletePlaylistItem
import dev.kyou.today.yourlist.entity.PlaylistItemResource
import redux.RAction

fun playlistItems(state: List<PlaylistItemResource> = emptyList(), action: RAction): List<PlaylistItemResource> =
    when (action) {
        is AddPlaylistItem -> state + action.resource
        is DeletePlaylistItem -> state.filter { it.id != action.id }

        else -> state
    }