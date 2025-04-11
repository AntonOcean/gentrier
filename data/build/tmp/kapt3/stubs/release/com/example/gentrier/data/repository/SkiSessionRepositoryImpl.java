package com.example.gentrier.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0013H\u0016J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0017\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/gentrier/data/repository/SkiSessionRepositoryImpl;", "Lcom/example/gentrier/domain/repository/SkiSessionRepository;", "skiSessionDao", "Lcom/example/gentrier/data/local/dao/SkiSessionDao;", "locationPointDao", "Lcom/example/gentrier/data/local/dao/LocationPointDao;", "(Lcom/example/gentrier/data/local/dao/SkiSessionDao;Lcom/example/gentrier/data/local/dao/LocationPointDao;)V", "addLocationPoint", "", "sessionId", "", "locationPoint", "Lcom/example/gentrier/domain/model/LocationPoint;", "(Ljava/lang/String;Lcom/example/gentrier/domain/model/LocationPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSession", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endSession", "Lcom/example/gentrier/domain/model/SkiSession;", "getActiveSession", "Lkotlinx/coroutines/flow/Flow;", "getAllSessions", "", "getSession", "startSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSession", "session", "(Lcom/example/gentrier/domain/model/SkiSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"})
public final class SkiSessionRepositoryImpl implements com.example.gentrier.domain.repository.SkiSessionRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.data.local.dao.SkiSessionDao skiSessionDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.data.local.dao.LocationPointDao locationPointDao = null;
    
    @javax.inject.Inject()
    public SkiSessionRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.dao.SkiSessionDao skiSessionDao, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.dao.LocationPointDao locationPointDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object startSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.SkiSession> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object endSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.SkiSession> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addLocationPoint(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.LocationPoint locationPoint, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.SkiSession> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.example.gentrier.domain.model.SkiSession> getActiveSession() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.gentrier.domain.model.SkiSession>> getAllSessions() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateSession(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.SkiSession session, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}