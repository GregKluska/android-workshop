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
    compileOnly(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

gradlePlugin {
    plugins {
        create("AndroidApplicationConventionPlugin") {
            id = "com.gregkluska.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        create("AndroidApplicationComposeConventionPlugin") {
            id = "com.gregkluska.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        create("AndroidLibraryConventionPlugin") {
            id = "com.gregkluska.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        create("AndroidLibraryComposeConventionPlugin") {
            id = "com.gregkluska.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        create("JvmLibraryConventionPlugin") {
            id = "com.gregkluska.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
    }
}