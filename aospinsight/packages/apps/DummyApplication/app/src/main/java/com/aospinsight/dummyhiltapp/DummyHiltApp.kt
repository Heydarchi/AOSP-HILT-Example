package com.aospinsight.dummyhiltapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class DummyHiltApp : Application() {

    override fun onCreate() {
        super.onCreate() // Injection happens in super.onCreate()
        Log.v("AppCompatActivity", "onCreate !!")
    }
}