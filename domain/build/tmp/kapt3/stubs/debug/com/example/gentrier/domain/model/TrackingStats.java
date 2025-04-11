package com.example.gentrier.domain.model;

/**
 * Stats related to a GPS tracking session
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003JO\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\fH\u00d6\u0001J\t\u00103\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010 \u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\"\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u00064"}, d2 = {"Lcom/example/gentrier/domain/model/TrackingStats;", "", "distance", "", "elapsedTime", "Ljava/time/Duration;", "avgSpeed", "maxSpeed", "elevationGain", "", "elevationLoss", "pointCount", "", "(FLjava/time/Duration;FFDDI)V", "getAvgSpeed", "()F", "getDistance", "getElapsedTime", "()Ljava/time/Duration;", "getElevationGain", "()D", "getElevationLoss", "formattedAvgSpeed", "", "getFormattedAvgSpeed", "()Ljava/lang/String;", "formattedDistance", "getFormattedDistance", "formattedElevationGain", "getFormattedElevationGain", "formattedElevationLoss", "getFormattedElevationLoss", "formattedMaxSpeed", "getFormattedMaxSpeed", "formattedTime", "getFormattedTime", "getMaxSpeed", "getPointCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "domain_debug"})
public final class TrackingStats {
    private final float distance = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.time.Duration elapsedTime = null;
    private final float avgSpeed = 0.0F;
    private final float maxSpeed = 0.0F;
    private final double elevationGain = 0.0;
    private final double elevationLoss = 0.0;
    private final int pointCount = 0;
    
    public TrackingStats(float distance, @org.jetbrains.annotations.NotNull()
    java.time.Duration elapsedTime, float avgSpeed, float maxSpeed, double elevationGain, double elevationLoss, int pointCount) {
        super();
    }
    
    public final float getDistance() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Duration getElapsedTime() {
        return null;
    }
    
    public final float getAvgSpeed() {
        return 0.0F;
    }
    
    public final float getMaxSpeed() {
        return 0.0F;
    }
    
    public final double getElevationGain() {
        return 0.0;
    }
    
    public final double getElevationLoss() {
        return 0.0;
    }
    
    public final int getPointCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedMaxSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedElevationGain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedElevationLoss() {
        return null;
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.Duration component2() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gentrier.domain.model.TrackingStats copy(float distance, @org.jetbrains.annotations.NotNull()
    java.time.Duration elapsedTime, float avgSpeed, float maxSpeed, double elevationGain, double elevationLoss, int pointCount) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}