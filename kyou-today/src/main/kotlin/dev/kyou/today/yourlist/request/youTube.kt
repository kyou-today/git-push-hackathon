package dev.kyou.today.yourlist.request

import io.ktor.client.HttpClient
import io.ktor.client.engine.js.Js
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer

val httpClient = HttpClient(Js) {
    install(JsonFeature) {
        serializer = KotlinxSerializer()
    }
}