package dev.kyou.today.yourlist.component

import react.RBuilder
import react.dom.header
import react.helmet.helmet
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

fun RBuilder.app() {
    helmet(title = "YourList - YouTube Playlist Player")

    header {
        child(Header::class) {}
    }

    browserRouter {
        switch {
            route("/", strict = true) {
                child(Main::class) {}
            }
        }
    }
}