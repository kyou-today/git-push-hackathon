package dev.kyou.today.yourlist.reducer

import dev.kyou.today.yourlist.State
import redux.RAction
import redux.Reducer
import redux.combineReducers
import kotlin.reflect.KProperty1

// Reducer<State, Action> = (S, A) -> S

fun <S, A> combineReducers(reducers: Map<KProperty1<S, *>, Reducer<*, A>>): Reducer<S, A> {
    return combineReducers(reducers.mapKeys { it.key.name })
}

fun combinedReducers() = combineReducers(
    mapOf<KProperty1<State, *>, Reducer<*, RAction>>(
        State::playlists to ::playlists,
        State::videos to ::playlistItems,
        State::loginState to ::login
    )
)