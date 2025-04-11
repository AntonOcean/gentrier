package com.example.gentrier.data.utils;

/**
 * Implements a simple Kalman filter for GPS location data smoothing.
 * This filter reduces noise from GPS readings, resulting in smoother location tracking.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\r\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/gentrier/data/utils/KalmanFilter;", "", "()V", "estimatedErrorCovariance", "", "kalmanGain", "lastAltitude", "", "Ljava/lang/Double;", "lastLatitude", "lastLongitude", "lastSpeed", "Ljava/lang/Float;", "observationNoiseCovariance", "processNoiseCovariance", "applyFilter", "Landroid/location/Location;", "location", "configure", "", "processNoise", "observationNoise", "getLastSpeed", "()Ljava/lang/Float;", "reset", "data_debug"})
public final class KalmanFilter {
    private float kalmanGain = 0.0F;
    private float estimatedErrorCovariance = 1.0F;
    private float processNoiseCovariance = 0.001F;
    private float observationNoiseCovariance = 0.01F;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double lastLatitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double lastLongitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double lastAltitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float lastSpeed;
    
    public KalmanFilter() {
        super();
    }
    
    /**
     * Apply Kalman filter to the given location
     * @param location Raw location from GPS
     * @return Filtered location with smoothed values
     */
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location applyFilter(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
        return null;
    }
    
    /**
     * Reset the filter state
     */
    public final void reset() {
    }
    
    /**
     * Configure the filter parameters
     * @param processNoise How much to trust the model prediction (lower = smoother)
     * @param observationNoise How much to trust the observations (higher = smoother)
     */
    public final void configure(float processNoise, float observationNoise) {
    }
    
    /**
     * Get last known filtered speed in m/s
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getLastSpeed() {
        return null;
    }
}