package dev.kyou.today.yourlist

import dev.kyou.today.yourlist.entity.PlaylistItemResource
import dev.kyou.today.yourlist.entity.PlaylistResource

class State {
    val loginState: LoginState = LoginState(false, null)
    val playlists = listOf<PlaylistResource>()
    val videos = listOf<PlaylistItemResource>()
}

data class LoginState(
    val loggedIn: Boolean,
    val token: String?
)