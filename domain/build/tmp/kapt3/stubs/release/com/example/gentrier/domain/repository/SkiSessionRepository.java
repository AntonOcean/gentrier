package com.example.gentrier.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eH&J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000eH&J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/example/gentrier/domain/repository/SkiSessionRepository;", "", "addLocationPoint", "", "sessionId", "", "locationPoint", "Lcom/example/gentrier/domain/model/LocationPoint;", "(Ljava/lang/String;Lcom/example/gentrier/domain/model/LocationPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSession", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endSession", "Lcom/example/gentrier/domain/model/SkiSession;", "getActiveSession", "Lkotlinx/coroutines/flow/Flow;", "getAllSessions", "", "getSession", "startSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSession", "session", "(Lcom/example/gentrier/domain/model/SkiSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public abstract interface SkiSessionRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object startSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.SkiSession> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object endSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.SkiSession> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addLocationPoint(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.LocationPoint locationPoint, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.SkiSession> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.gentrier.domain.model.SkiSession> getActiveSession();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.gentrier.domain.model.SkiSession>> getAllSessions();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSession(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.SkiSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}