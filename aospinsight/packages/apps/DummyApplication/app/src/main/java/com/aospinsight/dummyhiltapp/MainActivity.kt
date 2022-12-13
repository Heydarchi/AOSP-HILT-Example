package com.aospinsight.dummyhiltapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject


@AndroidEntryPoint(AppCompatActivity::class)
class MainActivity : Hilt_MainActivity() {

    @Inject lateinit var  storageHelper : StorageHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("AppCompatActivity", "onCreate !!")


        Log.v(LOG, "isExternalStorageReadOnly: ${storageHelper.isExternalStorageReadOnly()}")

        Log.v(LOG, "isExternalStorageAvailable:  ${storageHelper.isExternalStorageAvailable()}")
        
    }

    companion object{
        val LOG = "DummyHiltApp"
    }


}