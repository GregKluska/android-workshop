plugins {
    id(libs.plugins.workshop.android.library.asProvider().get().pluginId)
    id(libs.plugins.workshop.android.library.compose.get().pluginId)
    id(libs.plugins.workshop.android.hilt.get().pluginId)
}

android {
    namespace = "com.gregkluska.feature.animation"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(projects.common.ui)

    implementation(libs.androidx.appcompat)
    implementation(libs.bundles.compose.navigation)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}