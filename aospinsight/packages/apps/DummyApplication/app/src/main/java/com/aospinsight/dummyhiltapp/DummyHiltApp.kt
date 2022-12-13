package com.aospinsight.dummyhiltapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp(Application::class)
class DummyHiltApp : Hilt_DummyHiltApp() {

    override fun onCreate() {
        super.onCreate() // Injection happens in super.onCreate()
        Log.v("AppCompatActivity", "onCreate !!")
    }
}