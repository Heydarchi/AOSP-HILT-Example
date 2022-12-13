package com.aospinsight.dummyhiltapp

import android.os.Environment
import javax.inject.Singleton

@Singleton
class StorageHelper{

    fun isExternalStorageReadOnly(): Boolean {
        val extStorageState : String = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)) {
            return true;
        }
        return false;
    }

    fun isExternalStorageAvailable(): Boolean {
        val extStorageState : String = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(extStorageState)) {
            return true;
        }
        return false;
    }
}