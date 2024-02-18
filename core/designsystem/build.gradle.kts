@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.example.core.designsystem"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
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
        kotlinCompilerExtensionVersion = libs.versions.composeKotlinCompiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    api(libs.core.ktx)
    api(libs.androidx.appcompat)
    api(libs.activity.compose)
    api(platform(libs.compose.bom))
    api(libs.compose)
    api(libs.compose.runtime)
    api(libs.compose.graphics)
    api(libs.compose.material.icons)
    api(libs.compose.tooling.preview)
    api(libs.compose.tooling)
    api(libs.compose.kotlin.compiler)
    api(libs.compose.material.icons)
    api(libs.compose.material.icons.core)
    api(libs.material)
    api(libs.material3)
    api(libs.androidx.compose.material)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}