plugins {
    `kotlin-dsl`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.spotless.gradlePlugin)
    compileOnly(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

gradlePlugin {
    plugins {
        register("root") {
            id = "com.gregkluska.root"
            implementationClass = "RootConventionPlugin"
        }

        register("AndroidApplicationConventionPlugin") {
            id = "com.gregkluska.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("AndroidApplicationComposeConventionPlugin") {
            id = "com.gregkluska.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("AndroidLibraryConventionPlugin") {
            id = "com.gregkluska.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("AndroidLibraryComposeConventionPlugin") {
            id = "com.gregkluska.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("JvmLibraryConventionPlugin") {
            id = "com.gregkluska.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
    }
}