package com.example.gentrier.presentation.feature.session.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a(\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a \u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0013H\u0002\u001a\u001a\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002\u00a8\u0006\u001a"}, d2 = {"DetailStatRow", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "label", "", "value", "SessionDetailScreen", "sessionId", "onBackPressed", "Lkotlin/Function0;", "viewModel", "Lcom/example/gentrier/presentation/feature/session/detail/SessionDetailViewModel;", "StatisticItem", "formatDistance", "distance", "", "formatDuration", "start", "Ljava/time/LocalDateTime;", "end", "formatFullDate", "dateTime", "formatTimeRange", "startTime", "endTime", "presentation_debug"})
public final class SessionDetailScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void SessionDetailScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.presentation.feature.session.detail.SessionDetailViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void StatisticItem(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DetailStatRow(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    private static final java.lang.String formatFullDate(java.time.LocalDateTime dateTime) {
        return null;
    }
    
    private static final java.lang.String formatTimeRange(java.time.LocalDateTime startTime, java.time.LocalDateTime endTime) {
        return null;
    }
    
    private static final java.lang.String formatDuration(java.time.LocalDateTime start, java.time.LocalDateTime end) {
        return null;
    }
    
    private static final java.lang.String formatDistance(float distance) {
        return null;
    }
}