package dev.kyou.today.yourlist.reducer

import dev.kyou.today.yourlist.entity.PlaylistItemResource
import dev.kyou.today.yourlist.entity.PlaylistResource
import redux.RAction
import kotlin.reflect.KProperty1
import kotlin.reflect.KFunction2

class State {
    val playlists = arrayOf<PlaylistResource>()
    val videos = arrayOf<PlaylistItemResource>()
}

@Suppress("UNCHECKED_CAST")
fun combinedReducers() = combineReducers(
    mapOf<KProperty1<State, *>, KFunction2<*, RAction, *>>(
        State::playlists to ::playlists,
        State::videos to ::playlistItems
    )
)