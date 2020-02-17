package dev.kyou.today.yourlist.reducer

import dev.kyou.today.yourlist.action.AddPlaylist
import dev.kyou.today.yourlist.action.DeletePlaylist
import dev.kyou.today.yourlist.action.RefreshPlaylist
import dev.kyou.today.yourlist.entity.PlaylistResource
import redux.RAction

fun playlists(state: List<PlaylistResource> = emptyList(), action: RAction): List<PlaylistResource> = when (action) {
    // 最低要件:プレイリストの追加
    is AddPlaylist -> state + action.resource
    // 追加機能:プレイリストの削除
    is DeletePlaylist -> state.filter { it.id != action.id }
    is RefreshPlaylist -> action.resources

    else -> state
}