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
}

object Modules {
    const val utilities = ":utilities"
}