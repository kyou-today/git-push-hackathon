package dev.kyou.today.yourlist.util

import dev.kyou.today.yourlist.config.clientId
import dev.kyou.today.yourlist.config.redirectUri
import io.ktor.http.URLBuilder
import io.ktor.http.URLProtocol
import kotlin.browser.window

/**
 * 遅延初期化されたOAuth認証用URL
 * 一度初期化すると2度目以降は保存された内容を返却する。
 */
private val url by lazy {
    URLBuilder().apply {
        protocol = URLProtocol.HTTPS
        host = "accounts.google.com"
        encodedPath = "o/oauth2/auth"
        parameters.apply {
            append("client_id", clientId)
            append("redirect_uri", redirectUri)
            append("response_type", "token")
            appendAll("scope", listOf("https://www.googleapis.com/auth/youtube"))
        }
    }.buildString()
}

/**
 * OAuth認証画面を表示する。
 */
fun login() {
    window.open(url)
}