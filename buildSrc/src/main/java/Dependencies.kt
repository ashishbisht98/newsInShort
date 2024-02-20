object Dependencies {

    val impCoreKtx by lazy { "androidx.core:core-ktx:${Versions.impCoreKtx}" }
    val impLifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.impLifecycleRuntimeKtx}" }
    val impActivityCompose by lazy { "androidx.activity:activity-compose:${Versions.impActivityCompose}" }
    val impComposeBom by lazy { "androidx.compose:compose-bom:${Versions.impComposeBom}" }
    val impComposeUi by lazy { "androidx.compose.ui:ui:${Versions.impComposeUi}" }
    val impComposeUiGraphics by lazy { "androidx.compose.ui:ui-graphics:${Versions.impComposeUiGraphics}" }
    val impComposeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.impComposeUiToolingPreview}" }
    val impComposeMaterial3 by lazy { "androidx.compose.material3:material3:${Versions.impComposeMaterial3}" }
    val impNavCompose by lazy { "androidx.navigation:navigation-compose:${Versions.impNavCompose}" }
    val testImpJUnit4 by lazy { "junit:junit:${Versions.testImpJUnit4}" }
    val impComposeUiTestJUnit by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.impComposeUiTestJUnit}" }
    val androidTestImpTestExtJUint4 by lazy { "androidx.test.ext:junit:${Versions.androidTestImpTestExtJUint4}" }
    val androidTestImpEspressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.androidTestImpEspressoCore}" }
    val androidTestImpComposeBom by lazy { "androidx.compose:compose-bom:${Versions.androidTestImpComposeBom}" }
    val androidTestImpComposeJUnit by lazy { "androidx.compose.ui:ui-test-junit4" }
    val debugImpUiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val debugImpUiTestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val impAppCompat by lazy { "androidx.appcompat:appcompat:${Versions.impAppCompat}" }
    val impMaterial by lazy { "com.google.android.material:material:${Versions.impMaterial}" }
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltAndroid}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompiler}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }
    val hiltNavigation by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigation}" }
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}"}
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}"}
    val gsonConvertor by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConvertor}"}
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"}
    val moshiConvertor by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConvertor}"}
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"}
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}" }
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}" }
    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreen}" }
    val coil by lazy { "io.coil-kt:coil-compose:${Versions.coil}" }
}

object Modules {
    const val utilities = ":utilities"
}