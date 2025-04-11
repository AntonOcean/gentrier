package com.example.gentrier.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/gentrier/data/repository/LocationTrackingRepositoryImpl;", "Lcom/example/gentrier/domain/repository/LocationTrackingRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getLocationUpdates", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/gentrier/domain/model/LocationPoint;", "isTracking", "", "startTracking", "", "stopTracking", "data_release"})
public final class LocationTrackingRepositoryImpl implements com.example.gentrier.domain.repository.LocationTrackingRepository {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
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
}