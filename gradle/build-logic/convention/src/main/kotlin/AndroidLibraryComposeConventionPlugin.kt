import com.android.build.api.dsl.LibraryExtension
import com.gregkluska.gradle.configureAndroidCompose
import com.gregkluska.gradle.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {
        with(pluginManager) {
            apply(libs.plugins.android.library.get().pluginId)
        }

        extensions.configure<LibraryExtension> {
            configureAndroidCompose(this)
        }
    }

}