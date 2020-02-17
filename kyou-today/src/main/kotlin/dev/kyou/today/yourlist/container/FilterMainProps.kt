package dev.kyou.today.yourlist.container

import dev.kyou.today.yourlist.State
import dev.kyou.today.yourlist.component.Main
import dev.kyou.today.yourlist.component.MainProps
import react.RClass
import react.RProps
import react.invoke
import react.redux.rConnect

val filterMainProps = rConnect<State, RProps, MainProps>(mapStateToProps = { state, _ ->
    loggedIn = state.loginState.loggedIn
    token = state.loginState.token
    playlists = state.playlists
    videos = state.videos
})(Main::class.js.unsafeCast<RClass<MainProps>>())