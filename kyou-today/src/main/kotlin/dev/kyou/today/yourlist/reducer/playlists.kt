package dev.kyou.today.yourlist.reducer

import dev.kyou.today.yourlist.action.AddPlaylist
import dev.kyou.today.yourlist.action.DeletePlaylist
import dev.kyou.today.yourlist.action.RefreshPlaylist
import dev.kyou.today.yourlist.entity.PlaylistResource
import redux.RAction

fun playlists(state: Array<PlaylistResource> = emptyArray(), action: RAction): Array<PlaylistResource> = when (action) {
    // 最低要件:プレイリストの追加
    is AddPlaylist -> state + action.resource
    // 追加機能:プレイリストの削除
    is DeletePlaylist -> state.filter { it.id != action.id }.toTypedArray()
    is RefreshPlaylist -> action.resources.toTypedArray()

    else -> state
}