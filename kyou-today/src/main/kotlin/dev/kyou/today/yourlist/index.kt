package dev.kyou.today.yourlist

import dev.kyou.today.yourlist.component.app
import dev.kyou.today.yourlist.reducer.combinedReducers
import react.dom.render
import react.redux.provider
import redux.RAction
import redux.compose
import redux.createStore
import redux.rEnhancer
import kotlin.browser.document

@Suppress("UnsafeCastFromDynamic")
val store = createStore<State, RAction, dynamic>(
    combinedReducers(),
    State(),
    compose(
        rEnhancer(),
        js("if(window.__REDUX_DEVTOOLS_EXTENSION__ )window.__REDUX_DEVTOOLS_EXTENSION__ ();else(function(f){return f;});")
    )
)

fun main() {
    render(document.getElementById("root")) {
        provider(store) {
            app()
        }
    }
}