import org.gradle.api.JavaVersion

object Config {
    const val minSdk = 23
    const val compileSdk = 31
    const val targetSdk = 31
    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTargetVersion = "1.8"
}