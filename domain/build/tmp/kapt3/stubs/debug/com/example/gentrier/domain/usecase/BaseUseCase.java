package com.example.gentrier.domain.usecase;

/**
 * Base interface for Use Cases (Interactors) in Clean Architecture
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\u0016\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u00a6B\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/gentrier/domain/usecase/BaseUseCase;", "Params", "Type", "", "invoke", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface BaseUseCase<Params extends java.lang.Object, Type extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object invoke(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Type> $completion);
}