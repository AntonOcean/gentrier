package com.example.gentrier.presentation.feature.session.active;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a4\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017\u001a\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a\u001a\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001a\u00a8\u0006#"}, d2 = {"ActiveSessionScreen", "", "onFinishSession", "Lkotlin/Function1;", "", "onCancel", "Lkotlin/Function0;", "viewModel", "Lcom/example/gentrier/presentation/feature/session/active/ActiveSessionViewModel;", "CurrentStatsCard", "currentLocation", "Lcom/example/gentrier/domain/model/LocationPoint;", "session", "Lcom/example/gentrier/domain/model/SkiSession;", "SessionSummaryCard", "StatItem", "value", "label", "formatAltitude", "altitude", "", "formatDateTime", "dateTime", "Ljava/time/LocalDateTime;", "formatDistance", "distance", "", "formatDuration", "start", "end", "formatElevation", "gain", "loss", "formatSpeed", "speed", "presentation_release"})
public final class ActiveSessionScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void ActiveSessionScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFinishSession, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancel, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.presentation.feature.session.active.ActiveSessionViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CurrentStatsCard(@org.jetbrains.annotations.Nullable()
    com.example.gentrier.domain.model.LocationPoint currentLocation, @org.jetbrains.annotations.Nullable()
    com.example.gentrier.domain.model.SkiSession session) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SessionSummaryCard(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.SkiSession session) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void StatItem(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatSpeed(float speed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatAltitude(double altitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDistance(float distance) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatElevation(float gain, float loss) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDateTime(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime dateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDuration(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime start, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime end) {
        return null;
    }
}