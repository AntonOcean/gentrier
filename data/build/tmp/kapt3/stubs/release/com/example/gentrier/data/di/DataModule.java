package com.example.gentrier.data.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0012\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/gentrier/data/di/DataModule;", "", "()V", "provideLocationPointDao", "Lcom/example/gentrier/data/local/dao/LocationPointDao;", "database", "Lcom/example/gentrier/data/local/SkiTrackerDatabase;", "provideLocationTrackingRepository", "Lcom/example/gentrier/domain/repository/LocationTrackingRepository;", "context", "Landroid/content/Context;", "provideSkiSessionDao", "Lcom/example/gentrier/data/local/dao/SkiSessionDao;", "provideSkiSessionRepository", "Lcom/example/gentrier/domain/repository/SkiSessionRepository;", "skiSessionDao", "locationPointDao", "provideSkiTrackerDatabase", "data_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.gentrier.data.di.DataModule INSTANCE = null;
    
    private DataModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.gentrier.data.local.SkiTrackerDatabase provideSkiTrackerDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.gentrier.data.local.dao.SkiSessionDao provideSkiSessionDao(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.SkiTrackerDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.gentrier.data.local.dao.LocationPointDao provideLocationPointDao(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.SkiTrackerDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.gentrier.domain.repository.SkiSessionRepository provideSkiSessionRepository(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.dao.SkiSessionDao skiSessionDao, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.dao.LocationPointDao locationPointDao) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.gentrier.domain.repository.LocationTrackingRepository provideLocationTrackingRepository(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}