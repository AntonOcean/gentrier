package com.example.gentrier.data.service;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\"\u0010\u0017\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/example/gentrier/data/service/LocationTrackingService;", "Landroid/app/Service;", "()V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mainActivityClass", "Ljava/lang/Class;", "getMainActivityClass", "()Ljava/lang/Class;", "setMainActivityClass", "(Ljava/lang/Class;)V", "createNotificationChannel", "", "getMainActivityPendingIntent", "Landroid/app/PendingIntent;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "startLocationTracking", "stopLocationTracking", "Companion", "data_release"})
public final class LocationTrackingService extends android.app.Service {
    private static final int NOTIFICATION_ID = 1001;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHANNEL_ID = "ski_tracker_channel";
    private static final long UPDATE_INTERVAL = 1000L;
    private static final long FASTEST_INTERVAL = 500L;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isTracking = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isTracking = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.MutableStateFlow<com.example.gentrier.domain.model.LocationPoint> _locationUpdates = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.domain.model.LocationPoint> locationUpdates = null;
    @javax.inject.Inject()
    public java.lang.Class<?> mainActivityClass;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.google.android.gms.location.LocationCallback locationCallback;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.gentrier.data.service.LocationTrackingService.Companion Companion = null;
    
    public LocationTrackingService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Class<?> getMainActivityClass() {
        return null;
    }
    
    public final void setMainActivityClass(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    private final void createNotificationChannel() {
    }
    
    private final android.app.PendingIntent getMainActivityPendingIntent() {
        return null;
    }
    
    private final void startLocationTracking() {
    }
    
    private final void stopLocationTracking() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/example/gentrier/data/service/LocationTrackingService$Companion;", "", "()V", "CHANNEL_ID", "", "FASTEST_INTERVAL", "", "NOTIFICATION_ID", "", "UPDATE_INTERVAL", "_isTracking", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_locationUpdates", "Lcom/example/gentrier/domain/model/LocationPoint;", "isTracking", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "locationUpdates", "getLocationUpdates", "data_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isTracking() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.flow.StateFlow<com.example.gentrier.domain.model.LocationPoint> getLocationUpdates() {
            return null;
        }
    }
}