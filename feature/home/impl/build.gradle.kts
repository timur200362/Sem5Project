@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.example.feature.home.impl"
    compileSdk = libs.versions.compileSdk.get().toInt()

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(project(":feature:home:api"))

    implementation(project(":core:widget"))
    implementation(project(":core:network"))
    implementation(project(":core:db"))
    implementation(project(":core:utils"))
    implementation(project(":core:navigation"))
    implementation(project(":core:presentation"))

    implementation(libs.koin)
    implementation(libs.koin.compose)

    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}