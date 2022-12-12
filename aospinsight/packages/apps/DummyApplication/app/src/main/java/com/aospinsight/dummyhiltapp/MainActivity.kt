package com.aospinsight.dummyhiltapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var  storageHelper : StorageHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("AppCompatActivity", "onCreate !!")
    }


}