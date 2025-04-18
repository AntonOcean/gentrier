package com.example.gentrier.presentation.feature.session.history;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a4\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0015H\u0002\u001a\u001a\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002\u00a8\u0006\u001c"}, d2 = {"SessionHistoryItem", "", "session", "Lcom/example/gentrier/domain/model/SkiSession;", "onClick", "Lkotlin/Function0;", "SessionHistoryScreen", "onSessionSelected", "Lkotlin/Function1;", "", "onBackPressed", "viewModel", "Lcom/example/gentrier/presentation/feature/session/history/SessionHistoryViewModel;", "StatInfoItem", "value", "label", "formatDistance", "distance", "", "formatDuration", "start", "Ljava/time/LocalDateTime;", "end", "formatSessionDate", "dateTime", "formatSessionTime", "startTime", "endTime", "presentation_debug"})
public final class SessionHistoryScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void SessionHistoryScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSessionSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.presentation.feature.session.history.SessionHistoryViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SessionHistoryItem(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.SkiSession session, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void StatInfoItem(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    private static final java.lang.String formatSessionDate(java.time.LocalDateTime dateTime) {
        return null;
    }
    
    private static final java.lang.String formatSessionTime(java.time.LocalDateTime startTime, java.time.LocalDateTime endTime) {
        return null;
    }
    
    private static final java.lang.String formatDuration(java.time.LocalDateTime start, java.time.LocalDateTime end) {
        return null;
    }
    
    private static final java.lang.String formatDistance(float distance) {
        return null;
    }
}