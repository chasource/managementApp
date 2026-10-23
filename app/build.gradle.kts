plugins {
    alias(libs.plugins.android.application)
    alias (com.android.application)
    id (org.jetbrains.kotlin.android)
    id (com.google.devtools.ksp)
}

android {
    namespace = "com.example.managementapp"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }

        buildFeatures {
            viewBinding = true
        }
    }

    defaultConfig {
        applicationId = "com.example.managementapp"
        minSdk = 24
        targetSdk = 37
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
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    implementation("com.android.databinding:viewbinding:8.0.0")

    //gradle room
    def room_version = "2.6.1"
    implementation (androidx.room:room-runtime:$room_version)
    implementation (androidx.room:room-ktx:$room_version)

    //kompiler room
    ksp (androidx.room:room-compiler:$room_version)
}