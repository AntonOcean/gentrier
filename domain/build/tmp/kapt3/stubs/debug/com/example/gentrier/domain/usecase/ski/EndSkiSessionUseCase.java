package com.example.gentrier.domain.usecase.ski;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0086B\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/gentrier/domain/usecase/ski/EndSkiSessionUseCase;", "", "skiSessionRepository", "Lcom/example/gentrier/domain/repository/SkiSessionRepository;", "locationTrackingRepository", "Lcom/example/gentrier/domain/repository/LocationTrackingRepository;", "(Lcom/example/gentrier/domain/repository/SkiSessionRepository;Lcom/example/gentrier/domain/repository/LocationTrackingRepository;)V", "invoke", "Lcom/example/gentrier/domain/model/SkiSession;", "sessionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class EndSkiSessionUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.repository.LocationTrackingRepository locationTrackingRepository = null;
    
    @javax.inject.Inject()
    public EndSkiSessionUseCase(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.repository.LocationTrackingRepository locationTrackingRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.SkiSession> $completion) {
        return null;
    }
}