object Libs {
    private const val coroutinesVersion = "1.5.1"
    const val coreKtx = "androidx.core:core-ktx:1.7.0"
    const val appCompat = "androidx.appcompat:appcompat:1.4.1"
    const val androidMaterial = "com.google.android.material:material:1.6.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.3"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${coroutinesVersion}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${coroutinesVersion}"
    const val startup = "androidx.startup:startup-runtime:1.1.0"

    // LifeCycle
    private const val lifecycleVersion = "2.3.1"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${lifecycleVersion}"
    const val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${lifecycleVersion}"

    // Koin
    private const val koinVersion = "2.2.3"
    const val koinCore = "io.insert-koin:koin-core:${koinVersion}"
    const val koinAndroid = "io.insert-koin:koin-android:${koinVersion}"
    const val koinScope = "io.insert-koin:koin-androidx-scope:${koinVersion}"
    const val koinViewModel = "io.insert-koin:koin-androidx-viewmodel:${koinVersion}"
}