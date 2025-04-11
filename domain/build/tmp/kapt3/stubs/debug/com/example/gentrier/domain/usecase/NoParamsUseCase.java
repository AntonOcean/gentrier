package com.example.gentrier.domain.usecase;

/**
 * For use cases that don't require input parameters
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00028\u0000H\u0086B\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/gentrier/domain/usecase/NoParamsUseCase;", "Type", "Lcom/example/gentrier/domain/usecase/BaseUseCase;", "", "()V", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract class NoParamsUseCase<Type extends java.lang.Object> implements com.example.gentrier.domain.usecase.BaseUseCase<kotlin.Unit, Type> {
    
    public NoParamsUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Type> $completion) {
        return null;
    }
}