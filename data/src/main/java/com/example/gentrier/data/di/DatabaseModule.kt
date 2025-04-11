package com.example.gentrier.data.di

import android.content.Context
import androidx.room.Room
import com.example.gentrier.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "gentrier_database"
        )
            .fallbackToDestructiveMigration() // Replace with proper migrations in production
            .build()
    }

    @Provides
    fun provideExampleDao(appDatabase: AppDatabase) = appDatabase.exampleDao()
} 