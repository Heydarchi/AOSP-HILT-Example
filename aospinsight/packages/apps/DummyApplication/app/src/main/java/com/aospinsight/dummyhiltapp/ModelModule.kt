package com.aospinsight.dummyhiltapp

import android.util.Log
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent::class)
internal object ModelModule {
  @Provides
  fun provideStorageHelper() : StorageHelper{
    Log.v("ModelModule", "provideStorageHelper called!")
    return StorageHelper()
  }

}
