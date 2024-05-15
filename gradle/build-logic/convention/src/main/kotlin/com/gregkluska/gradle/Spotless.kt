package com.gregkluska.gradle

import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.spotless.LineEnding
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

fun Project.configureSpotless() {
    with(pluginManager) {
        apply(libs.plugins.spotless.get().pluginId)
    }

    spotless {
        // Workaround for https://github.com/diffplug/spotless/issues/1644
        lineEndings = LineEnding.PLATFORM_NATIVE

        val ktlintVersion = libs.versions.ktlint.get()

        kotlin {
            target("src/**/*.kt")
            ktlint(ktlintVersion)
            trimTrailingWhitespace()
            endWithNewline()
        }

        kotlinGradle {
            target("*.kts")
            ktlint(ktlintVersion)
            trimTrailingWhitespace()
            endWithNewline()
        }
    }
}

private fun Project.spotless(action: SpotlessExtension.() -> Unit) = extensions.configure<SpotlessExtension>(action)