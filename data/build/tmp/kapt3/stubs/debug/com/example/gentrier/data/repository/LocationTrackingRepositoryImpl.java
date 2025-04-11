package com.example.gentrier.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/gentrier/data/repository/LocationTrackingRepositoryImpl;", "Lcom/example/gentrier/domain/repository/LocationTrackingRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "locationPointsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/gentrier/domain/model/LocationPoint;", "startTimeFlow", "Ljava/time/LocalDateTime;", "totalDistanceFlow", "", "calculateDistance", "lat1", "", "lon1", "lat2", "lon2", "getLocationUpdates", "Lkotlinx/coroutines/flow/Flow;", "getTrackingStats", "Lcom/example/gentrier/domain/model/TrackingStats;", "isTracking", "", "startTracking", "", "stopTracking", "data_debug"})
public final class LocationTrackingRepositoryImpl implements com.example.gentrier.domain.repository.LocationTrackingRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> totalDistanceFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.time.LocalDateTime> startTimeFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.gentrier.domain.model.LocationPoint>> locationPointsFlow = null;
    
    @javax.inject.Inject()
    public LocationTrackingRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void startTracking() {
    }
    
    @java.lang.Override()
    public void stopTracking() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.gentrier.domain.model.LocationPoint> getLocationUpdates() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> isTracking() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.gentrier.domain.model.TrackingStats> getTrackingStats() {
        return null;
    }
    
    /**
     * Calculate distance between two points using the Haversine formula
     * Returns distance in meters
     */
    private final float calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        return 0.0F;
    }
}