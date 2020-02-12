package dev.kyou.today.yourlist.component

import react.RBuilder
import react.dom.div
import react.dom.header
import react.dom.link
import react.dom.meta
import react.dom.script
import react.helmet.helmet
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

fun RBuilder.app() {
    helmet(title = "YourList - YouTube Playlist Player") {
        meta(null, "IE=edge") { attrs["httpEquiv"] = "X-UA-Compatible" }
        meta("viewport", "width=device-width") {}
        link(rel = "stylesheet", href = "https://cdn.jsdelivr.net/npm/uikit@3.3.1/dist/css/uikit.min.css") {}
        script(src = "https://cdn.jsdelivr.net/npm/uikit@3.3.1/dist/js/uikit.min.js") {}
        script(src = "https://cdn.jsdelivr.net/npm/uikit@3.3.1/dist/js/uikit-icons.min.js") {}
    }

    header {
        child(Header::class) {}
    }

    browserRouter {
        switch {
            route("/", strict = true) {
                div {
                    +"Working In Progress..." //TODO
                }
            }
        }
    }
}