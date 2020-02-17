object React {
    private const val wrapperVersion = "16.9.0-pre.91-kotlin-1.3.61"
    const val react = "org.jetbrains:kotlin-react:$wrapperVersion"
    const val dom = "org.jetbrains:kotlin-react-dom:$wrapperVersion"

    const val version = "16.12.0"

    object Router {
        private const val wrapperVersion = "4.3.1-pre.91-kotlin-1.3.61"
        const val router = "org.jetbrains:kotlin-react-router-dom:$wrapperVersion"

        const val version = "5.1.2"
    }

    object Redux {
        private const val wrapperVersion = "5.0.7-pre.91-kotlin-1.3.61"
        const val redux = "org.jetbrains:kotlin-react-redux:$wrapperVersion"

        const val version = "7.1.3"
    }

    object Helmet {
        private const val wrapperVersion = "1.2.0"
        const val helmet = "me.kgustave:kotlin-react-helmet:$wrapperVersion"

        const val version = "5.2.1"
    }
}

object Redux {
    val version = "4.0.5"
}

object Ktor {
    private const val version = "1.3.0"
    const val client = "io.ktor:ktor-client-js:$version"
    const val json = "io.ktor:ktor-client-json-js:$version"
    const val serializer = "io.ktor:ktor-client-serialization-js:$version"

    const val textEncodingVersion = "0.7.0"
    const val abortControllerVersion = "3.0.0"
    const val bufferUtilVersion = "4.0.1"
    const val utl8ValidateVersion = "5.0.2"
}