package dev.kyou.today.yourlist.component

import dev.kyou.today.yourlist.entity.PlaylistItemResource
import dev.kyou.today.yourlist.entity.PlaylistResource
import dev.kyou.today.yourlist.util.login
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

interface MainProps : RProps {
    var loggedIn: Boolean
    var token: String?
    var playlists: List<PlaylistResource>
    var videos: List<PlaylistItemResource>
}

class Main(props: MainProps) : RComponent<MainProps, RState>(props) {
    override fun RBuilder.render() {
        if (!props.loggedIn) {
            login()
        }
    }
}