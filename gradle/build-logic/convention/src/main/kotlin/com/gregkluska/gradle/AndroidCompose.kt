package com.gregkluska.gradle

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>
) {
    commonExtension.apply {
        buildFeatures {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get().toString()
        }
    }

    dependencies {
        val bom = libs.androidx.compose.bom.get()
        add("implementation", platform(bom))
        add("androidTestImplementation", platform(bom))
    }
}