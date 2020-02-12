plugins {
    kotlin("js") version "1.3.61"
}

group = "dev.kyou-today.hackathon"
version = "0.1.0"

repositories {
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(React.react)
    implementation(React.dom)
    implementation(React.Router.router)
    implementation(React.Redux.redux)
    implementation(React.Helmet.helmet)
}

kotlin {
    target {
        browser {
            runTask {
                outputFileName = "bundle.js"
            }
        }
        useCommonJs()
    }

    sourceSets["main"].dependencies {
        implementation(npm("react", React.version))
        implementation(npm("react-dom", React.version))
        implementation(npm("react-router-dom", React.Router.version))
        implementation(npm("react-redux", React.Redux.version))
        implementation(npm("redux", Redux.version))
        implementation(npm("react-helmet", React.Helmet.version))
    }
}

