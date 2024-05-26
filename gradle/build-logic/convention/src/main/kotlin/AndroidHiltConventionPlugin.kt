import com.gregkluska.gradle.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.ksp.get().pluginId)
                apply(libs.plugins.hilt.get().pluginId)
            }

            dependencies {
                add("implementation", libs.hilt.android)
                add("ksp", libs.hilt.compiler)
            }
        }
    }
}