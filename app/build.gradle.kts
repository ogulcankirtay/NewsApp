plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.oglcnkrty.newsapp"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.oglcnkrty.newsapp"
        minSdk = 24
        targetSdk = 36
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
    //Libraries ====================================================================================
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Core Modules ================================================================================
    implementation(projects.core.data)
    implementation(projects.core.common)
    implementation(projects.core.domain)
    implementation(projects.core.local)
    implementation(projects.core.remote)

    //Feature Modules ==============================================================================
    implementation(projects.feature.auth)
    implementation(projects.feature.home)
    implementation(projects.feature.profile)
}