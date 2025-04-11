package com.example.gentrier.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/example/gentrier/domain/repository/LocationTrackingRepository;", "", "getLocationUpdates", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/gentrier/domain/model/LocationPoint;", "getTrackingStats", "Lcom/example/gentrier/domain/model/TrackingStats;", "isTracking", "", "startTracking", "", "stopTracking", "domain_debug"})
public abstract interface LocationTrackingRepository {
    
    /**
     * Start location tracking with the foreground service
     */
    public abstract void startTracking();
    
    /**
     * Stop location tracking
     */
    public abstract void stopTracking();
    
    /**
     * Get a Flow of location updates
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.gentrier.domain.model.LocationPoint> getLocationUpdates();
    
    /**
     * Check if tracking is currently active
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> isTracking();
    
    /**
     * Get a Flow of tracking statistics that updates with new location points
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.gentrier.domain.model.TrackingStats> getTrackingStats();
}