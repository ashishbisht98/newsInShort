plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.newsinshort"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsinshort"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.impCoreKtx)
    implementation(Dependencies.impLifecycleRuntimeKtx)
    implementation(Dependencies.impActivityCompose)
    implementation(Dependencies.impComposeBom)
    implementation(Dependencies.impComposeUi)
    implementation(Dependencies.impComposeUiGraphics)
    implementation(Dependencies.impNavCompose
    )
    implementation(Dependencies.impComposeUiToolingPreview)
    implementation(Dependencies.impComposeMaterial3)
    testImplementation(Dependencies.testImpJUnit4)
    androidTestImplementation(Dependencies.androidTestImpTestExtJUint4)
    androidTestImplementation(Dependencies.androidTestImpEspressoCore)
    androidTestImplementation(Dependencies.androidTestImpComposeBom)
    androidTestImplementation(Dependencies.androidTestImpComposeJUnit)
    debugImplementation(Dependencies.debugImpUiTooling)
    debugImplementation(Dependencies.debugImpUiTestManifest)

    //Implementing Project utilities
    implementation(project(Modules.utilities))

    //Dagger-Hilt
    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
    kapt(Dependencies.hiltAndroidCompiler)
    implementation(Dependencies.hiltNavigation)

    //retrofit
    implementation(Dependencies.retrofit)
    implementation(Dependencies.moshiConvertor)
    implementation(Dependencies.moshi)
    implementation(Dependencies.loggingInterceptor)
    implementation(Dependencies.gsonConvertor)
    implementation(Dependencies.okhttp)

    //coroutines
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)

    //splashScreen
    implementation(Dependencies.splashScreen)

    //coil
    implementation(Dependencies.coil)
}

kapt {
    correctErrorTypes = true
}