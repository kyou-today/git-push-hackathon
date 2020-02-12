package dev.kyou.today.yourlist.reducer

import dev.kyou.today.yourlist.action.AddPlaylistItem
import dev.kyou.today.yourlist.action.DeletePlaylistItem
import dev.kyou.today.yourlist.entity.PlaylistItemResource
import redux.RAction

fun playlistItems(state: Array<PlaylistItemResource> = emptyArray(), action: RAction): Array<PlaylistItemResource> =
    when (action) {
        is AddPlaylistItem -> state + action.resource
        is DeletePlaylistItem -> state.filter { it.id != action.id }.toTypedArray()

        else -> state
    }