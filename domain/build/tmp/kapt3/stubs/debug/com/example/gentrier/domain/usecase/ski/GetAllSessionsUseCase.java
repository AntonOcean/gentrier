package com.example.gentrier.domain.usecase.ski;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/gentrier/domain/usecase/ski/GetAllSessionsUseCase;", "", "skiSessionRepository", "Lcom/example/gentrier/domain/repository/SkiSessionRepository;", "(Lcom/example/gentrier/domain/repository/SkiSessionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/gentrier/domain/model/SkiSession;", "domain_debug"})
public final class GetAllSessionsUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository = null;
    
    @javax.inject.Inject()
    public GetAllSessionsUseCase(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.repository.SkiSessionRepository skiSessionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.gentrier.domain.model.SkiSession>> invoke() {
        return null;
    }
}