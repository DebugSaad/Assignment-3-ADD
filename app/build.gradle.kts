plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.studynotesapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.studynotesapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
        // Core Android KTX (Stable version)
        implementation("androidx.core:core-ktx:1.13.1")

        // AppCompat (Stable version)
        implementation("androidx.appcompat:appcompat:1.7.0")

        // Material Design (Stable version)
        implementation("com.google.android.material:material:1.12.0")

        // Activity KTX (Stable version - yeh error fix karega)
        implementation("androidx.activity:activity-ktx:1.9.0")

        // ViewModel & LiveData
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.3")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.3")

        // Constraint Layout (Agar layout ke liye chahiye)
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")


}