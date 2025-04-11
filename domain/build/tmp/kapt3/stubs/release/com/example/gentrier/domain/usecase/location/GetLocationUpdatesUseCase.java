package com.example.gentrier.domain.usecase.location;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/gentrier/domain/usecase/location/GetLocationUpdatesUseCase;", "", "locationTrackingRepository", "Lcom/example/gentrier/domain/repository/LocationTrackingRepository;", "skiSessionRepository", "Lcom/example/gentrier/domain/repository/SkiSessionRepository;", "(Lcom/example/gentrier/domain/repository/LocationTrackingRepository;Lcom/example/gentrier/domain/repository/SkiSessionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/gentrier/domain/model/LocationPoint;", "domain_release"})
public final class GetLocationUpdatesUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.repository.LocationTrackingRepository locationTrackingRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository = null;
    
    @javax.inject.Inject()
    public GetLocationUpdatesUseCase(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.repository.LocationTrackingRepository locationTrackingRepository, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.gentrier.domain.model.LocationPoint> invoke() {
        return null;
    }
}