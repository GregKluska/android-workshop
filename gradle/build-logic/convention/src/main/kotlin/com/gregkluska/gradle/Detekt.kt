package com.gregkluska.gradle

import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.named

internal fun Project.configureDetekt() {
    with(pluginManager) {
        apply(libs.plugins.detekt.get().pluginId)
    }

    detekt {
        toolVersion = libs.versions.detekt.get()
        config.setFrom("$rootDir/detekt.yml")
        buildUponDefaultConfig = true
    }

    tasks.named<Detekt>("detekt") {
        reports {
            xml.required.set(true)
            html.required.set(true)
            txt.required.set(true)
            sarif.required.set(true)
            md.required.set(true)
        }
    }

    dependencies {
        add("detektPlugins", libs.detekt.formatting)
    }
}

private fun Project.detekt(action: DetektExtension.() -> Unit) =
    extensions.configure<DetektExtension>(action)