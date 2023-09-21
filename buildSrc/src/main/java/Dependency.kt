object Version {
    const val KOTLIN = "1.8.21"
    const val MIN_SDK_VERSION = 23
    const val TARGET_SDK_VERSION = 33

    const val COMPILE_SDK_VERSION = 33
    const val APP_VERSION_CODE = 3000
    const val APP_VERSION_NAME = "0.0.0.1"
}

object AndroidXMiscellaneous {
    const val CORE_KTX = "androidx.core:core-ktx:1.10.1"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.6.1"
    const val ACTIVITY_COMPAT = "androidx.activity:activity-ktx:1.4.0"
    const val FRAGMENT_COMPAT = "androidx.fragment:fragment-ktx:1.5.7"
}

object GoogleAndroid {
    const val MATERIAL_DESIGN = "com.google.android.material:material:1.9.0"
    const val GSON = "com.google.code.gson:gson:2.10.1"
}

object AndroidXUI {
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.3.0"
    const val CARD_VIEW = "androidx.cardview:cardview:1.0.0"
    const val DYNAMIC_ANIMATION = "androidx.dynamicanimation:dynamicanimation:1.0.0"
}

object AndroidXTesting {
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.5"
    const val JUNIT = "junit:junit:4.13.2"
    const val EXT_JUNIT_KTX = "androidx.test.ext:junit-ktx:1.1.5"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.5.1"
}

object NetworkLib {
    private const val retrofitVersion = "2.9.0"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:$retrofitVersion"
}

object Lifecycle {
    private const val lifecycleVersion = "2.6.2"
    const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
}

object Navigation {
    private const val navigationVersion = "2.5.3"
    const val NAVIGATION_FRAGMENT =
        "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
}