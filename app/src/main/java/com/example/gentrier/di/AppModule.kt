package com.example.gentrier.di

import com.example.gentrier.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMainActivityClass(): Class<*> {
        return MainActivity::class.java
    }
} 