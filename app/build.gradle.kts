import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("realm-android")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "ru.falseteam.tasks"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk8", KotlinCompilerVersion.VERSION))

    implementation("androidx.appcompat:appcompat:1.1.0-alpha02")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.google.android.material:material:1.1.0-alpha03")

    implementation("com.google.dagger:dagger:2.13")
    kapt("com.google.dagger:dagger-compiler:2.13")

    kapt("dk.ilios:realmfieldnameshelper:1.1.1")

    testImplementation("junit:junit:4.12")

    androidTestImplementation("androidx.test:runner:1.1.2-alpha01")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.2-alpha01")
}
