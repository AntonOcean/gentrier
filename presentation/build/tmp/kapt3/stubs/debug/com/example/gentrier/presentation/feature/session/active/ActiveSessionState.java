package com.example.gentrier.presentation.feature.session.active;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/example/gentrier/presentation/feature/session/active/ActiveSessionState;", "", "isLoading", "", "isEnding", "session", "Lcom/example/gentrier/domain/model/SkiSession;", "currentLocation", "Lcom/example/gentrier/domain/model/LocationPoint;", "error", "", "sessionEnded", "sessionId", "(ZZLcom/example/gentrier/domain/model/SkiSession;Lcom/example/gentrier/domain/model/LocationPoint;Ljava/lang/String;ZLjava/lang/String;)V", "getCurrentLocation", "()Lcom/example/gentrier/domain/model/LocationPoint;", "getError", "()Ljava/lang/String;", "()Z", "getSession", "()Lcom/example/gentrier/domain/model/SkiSession;", "getSessionEnded", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "presentation_debug"})
public final class ActiveSessionState {
    private final boolean isLoading = false;
    private final boolean isEnding = false;
    @org.jetbrains.annotations.Nullable()
    private final com.example.gentrier.domain.model.SkiSession session = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.gentrier.domain.model.LocationPoint currentLocation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    private final boolean sessionEnded = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sessionId = null;
    
    public ActiveSessionState(boolean isLoading, boolean isEnding, @org.jetbrains.annotations.Nullable()
    com.example.gentrier.domain.model.SkiSession session, @org.jetbrains.annotations.Nullable()
    com.example.gentrier.domain.model.LocationPoint currentLocation, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean sessionEnded, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isEnding() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.gentrier.domain.model.SkiSession getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.gentrier.domain.model.LocationPoint getCurrentLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean getSessionEnded() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionId() {
        return null;
    }
    
    public ActiveSessionState() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.gentrier.domain.model.SkiSession component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.gentrier.domain.model.LocationPoint component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gentrier.presentation.feature.session.active.ActiveSessionState copy(boolean isLoading, boolean isEnding, @org.jetbrains.annotations.Nullable()
    com.example.gentrier.domain.model.SkiSession session, @org.jetbrains.annotations.Nullable()
    com.example.gentrier.domain.model.LocationPoint currentLocation, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean sessionEnded, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
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