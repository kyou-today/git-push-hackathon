package dev.kyou.today.yourlist.reducer

import redux.Reducer
import redux.combineReducers
import kotlin.reflect.KProperty1

// Reducer<State, Action> = (S, A) -> S

fun <S, A> combineReducers(reducers: Map<KProperty1<S, *>, Reducer<*, A>>): Reducer<S, A> {
    return combineReducers(reducers.mapKeys { it.key.name })
}