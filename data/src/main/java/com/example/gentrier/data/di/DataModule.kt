package com.example.gentrier.data.di

import android.content.Context
import androidx.room.Room
import com.example.gentrier.data.local.SkiTrackerDatabase
import com.example.gentrier.data.local.dao.LocationPointDao
import com.example.gentrier.data.local.dao.SkiSessionDao
import com.example.gentrier.data.repository.LocationTrackingRepositoryImpl
import com.example.gentrier.data.repository.SkiSessionRepositoryImpl
import com.example.gentrier.domain.repository.LocationTrackingRepository
import com.example.gentrier.domain.repository.SkiSessionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideSkiTrackerDatabase(@ApplicationContext context: Context): SkiTrackerDatabase {
        return Room.databaseBuilder(
            context,
            SkiTrackerDatabase::class.java,
            "ski_tracker.db"
        ).build()
    }

    @Provides
    fun provideSkiSessionDao(database: SkiTrackerDatabase): SkiSessionDao {
        return database.skiSessionDao()
    }

    @Provides
    fun provideLocationPointDao(database: SkiTrackerDatabase): LocationPointDao {
        return database.locationPointDao()
    }

    @Provides
    @Singleton
    fun provideSkiSessionRepository(
        skiSessionDao: SkiSessionDao,
        locationPointDao: LocationPointDao
    ): SkiSessionRepository {
        return SkiSessionRepositoryImpl(skiSessionDao, locationPointDao)
    }

    @Provides
    @Singleton
    fun provideLocationTrackingRepository(
        @ApplicationContext context: Context
    ): LocationTrackingRepository {
        return LocationTrackingRepositoryImpl(context)
    }
} 