import com.android.build.api.dsl.LibraryExtension
import com.gregkluska.gradle.configureAndroidCommon
import com.gregkluska.gradle.configureSpotless
import com.gregkluska.gradle.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply(libs.plugins.android.library.get().pluginId)
            apply(libs.plugins.jetbrains.kotlin.android.get().pluginId)
        }

        extensions.configure<LibraryExtension> {
            configureAndroidCommon(this)
        }

        configureSpotless()
    }

}