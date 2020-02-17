package dev.kyou.today.yourlist.component

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a

class Header(props: RProps) : RComponent<RProps, RState>(props) {
    override fun RBuilder.render() {
        a("") {
            attrs["uk-icon"] = "menu"
        }
    }
}