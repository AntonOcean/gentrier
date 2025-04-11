package com.example.gentrier.data.utils;

/**
 * Manages location requests that adapt to different conditions like
 * battery level, user speed, and activity type.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/gentrier/data/utils/AdaptiveLocationRequestManager;", "", "()V", "highSpeedThreshold", "", "getHighSpeedThreshold", "()F", "setHighSpeedThreshold", "(F)V", "lowBatteryThreshold", "", "getLowBatteryThreshold", "()I", "setLowBatteryThreshold", "(I)V", "stationarySpeedThreshold", "getStationarySpeedThreshold", "setStationarySpeedThreshold", "createRequest", "Lcom/google/android/gms/location/LocationRequest;", "currentSpeed", "batteryLevel", "isCharging", "", "Companion", "data_debug"})
public final class AdaptiveLocationRequestManager {
    private static final long NORMAL_UPDATE_INTERVAL = 1000L;
    private static final long NORMAL_FASTEST_INTERVAL = 500L;
    private static final long BATTERY_SAVING_UPDATE_INTERVAL = 3000L;
    private static final long BATTERY_SAVING_FASTEST_INTERVAL = 1500L;
    private static final long HIGH_ACCURACY_UPDATE_INTERVAL = 500L;
    private static final long HIGH_ACCURACY_FASTEST_INTERVAL = 250L;
    private static final long STATIONARY_UPDATE_INTERVAL = 10000L;
    private static final long STATIONARY_FASTEST_INTERVAL = 5000L;
    private static final float DEFAULT_HIGH_SPEED_THRESHOLD = 15.0F;
    private static final int DEFAULT_LOW_BATTERY_THRESHOLD = 20;
    private static final float DEFAULT_STATIONARY_SPEED_THRESHOLD = 2.0F;
    private float highSpeedThreshold = 15.0F;
    private int lowBatteryThreshold = 20;
    private float stationarySpeedThreshold = 2.0F;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.gentrier.data.utils.AdaptiveLocationRequestManager.Companion Companion = null;
    
    public AdaptiveLocationRequestManager() {
        super();
    }
    
    public final float getHighSpeedThreshold() {
        return 0.0F;
    }
    
    public final void setHighSpeedThreshold(float p0) {
    }
    
    public final int getLowBatteryThreshold() {
        return 0;
    }
    
    public final void setLowBatteryThreshold(int p0) {
    }
    
    public final float getStationarySpeedThreshold() {
        return 0.0F;
    }
    
    public final void setStationarySpeedThreshold(float p0) {
    }
    
    /**
     * Creates a location request adapted to the current conditions
     *
     * @param currentSpeed Current speed in km/h
     * @param batteryLevel Current battery level (0-100)
     * @param isCharging Whether the device is currently charging
     * @return LocationRequest configured for the conditions
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationRequest createRequest(float currentSpeed, int batteryLevel, boolean isCharging) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/gentrier/data/utils/AdaptiveLocationRequestManager$Companion;", "", "()V", "BATTERY_SAVING_FASTEST_INTERVAL", "", "BATTERY_SAVING_UPDATE_INTERVAL", "DEFAULT_HIGH_SPEED_THRESHOLD", "", "DEFAULT_LOW_BATTERY_THRESHOLD", "", "DEFAULT_STATIONARY_SPEED_THRESHOLD", "HIGH_ACCURACY_FASTEST_INTERVAL", "HIGH_ACCURACY_UPDATE_INTERVAL", "NORMAL_FASTEST_INTERVAL", "NORMAL_UPDATE_INTERVAL", "STATIONARY_FASTEST_INTERVAL", "STATIONARY_UPDATE_INTERVAL", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}