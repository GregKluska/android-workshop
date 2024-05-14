import com.gregkluska.gradle.configureKotlinJvm
import com.gregkluska.gradle.libs
import org.gradle.api.Plugin
import org.gradle.api.Project

class JvmLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.jetbrains.kotlin.jvm.get().pluginId)
            }
            configureKotlinJvm()
        }
    }
}