plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "org.spotx.android.runtime"
    compileSdk = 35
    defaultConfig {
        applicationId = "org.spotx.android.runtime"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
    buildTypes { release { isMinifyEnabled = false } }
}
dependencies {
    compileOnly("de.robv.android.xposed:api:82")
}
