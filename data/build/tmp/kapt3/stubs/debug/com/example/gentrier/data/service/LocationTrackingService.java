package com.example.gentrier.data.service;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\"H\u0016J\b\u0010,\u001a\u00020\"H\u0016J\"\u0010-\u001a\u00020.2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\fH\u0002J\b\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\"H\u0002J\u0010\u00105\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00020\u001f*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010 \u00a8\u00067"}, d2 = {"Lcom/example/gentrier/data/service/LocationTrackingService;", "Landroid/app/Service;", "()V", "batteryManager", "Landroid/os/BatteryManager;", "currentSpeed", "", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "kalmanFilter", "Lcom/example/gentrier/data/utils/KalmanFilter;", "lastLocation", "Landroid/location/Location;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequestManager", "Lcom/example/gentrier/data/utils/AdaptiveLocationRequestManager;", "mainActivityClass", "Ljava/lang/Class;", "getMainActivityClass", "()Ljava/lang/Class;", "setMainActivityClass", "(Ljava/lang/Class;)V", "powerManager", "Landroid/os/PowerManager;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "totalDistance", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "isCharging", "", "(Landroid/os/BatteryManager;)Z", "createNotificationChannel", "", "getCurrentLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getMainActivityPendingIntent", "Landroid/app/PendingIntent;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "processLocation", "location", "startLocationTracking", "stopLocationTracking", "updateNotification", "Companion", "data_debug"})
public final class LocationTrackingService extends android.app.Service {
    private static final int NOTIFICATION_ID = 1001;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHANNEL_ID = "ski_tracker_channel";
    private static final long LOCATION_CONFIG_UPDATE_INTERVAL = 30L;
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
    private android.os.PowerManager powerManager;
    private android.os.BatteryManager batteryManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.data.utils.KalmanFilter kalmanFilter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.data.utils.AdaptiveLocationRequestManager locationRequestManager = null;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location lastLocation;
    private float totalDistance = 0.0F;
    private float currentSpeed = 0.0F;
    @org.jetbrains.annotations.Nullable()
    private android.os.PowerManager.WakeLock wakeLock;
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
    
    private final boolean isCharging(android.os.BatteryManager $this$isCharging) {
        return false;
    }
    
    private final com.google.android.gms.location.LocationRequest getCurrentLocationRequest() {
        return null;
    }
    
    private final void startLocationTracking() {
    }
    
    private final void processLocation(android.location.Location location) {
    }
    
    private final void updateNotification(float currentSpeed) {
    }
    
    private final void stopLocationTracking() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/example/gentrier/data/service/LocationTrackingService$Companion;", "", "()V", "CHANNEL_ID", "", "LOCATION_CONFIG_UPDATE_INTERVAL", "", "NOTIFICATION_ID", "", "_isTracking", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_locationUpdates", "Lcom/example/gentrier/domain/model/LocationPoint;", "isTracking", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "locationUpdates", "getLocationUpdates", "data_debug"})
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