plugins {
    `kotlin-dsl`
}

group = "com.gregkluska.gradle.reporter"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {

}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}
