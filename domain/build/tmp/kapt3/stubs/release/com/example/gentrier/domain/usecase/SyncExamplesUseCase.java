package com.example.gentrier.domain.usecase;

/**
 * Use case for syncing examples with the remote API
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\t\u001a\u00020\nH\u0096B\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/gentrier/domain/usecase/SyncExamplesUseCase;", "Lcom/example/gentrier/domain/usecase/NoParamsUseCase;", "Lcom/example/gentrier/domain/util/Resource;", "", "Lcom/example/gentrier/domain/model/Example;", "repository", "Lcom/example/gentrier/domain/repository/ExampleRepository;", "(Lcom/example/gentrier/domain/repository/ExampleRepository;)V", "invoke", "params", "", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"})
public final class SyncExamplesUseCase extends com.example.gentrier.domain.usecase.NoParamsUseCase<com.example.gentrier.domain.util.Resource<? extends java.util.List<? extends com.example.gentrier.domain.model.Example>>> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.domain.repository.ExampleRepository repository = null;
    
    @javax.inject.Inject()
    public SyncExamplesUseCase(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.repository.ExampleRepository repository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.Unit params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.util.Resource<? extends java.util.List<com.example.gentrier.domain.model.Example>>> $completion) {
        return null;
    }
}