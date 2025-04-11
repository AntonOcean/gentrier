package com.example.gentrier.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH&J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0010H\u00a6@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/example/gentrier/domain/repository/ExampleRepository;", "Lcom/example/gentrier/domain/repository/BaseRepository;", "addExample", "", "example", "Lcom/example/gentrier/domain/model/Example;", "(Lcom/example/gentrier/domain/model/Example;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteExample", "getAllExamples", "Lkotlinx/coroutines/flow/Flow;", "", "getExampleById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncExamples", "Lcom/example/gentrier/domain/util/Resource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateExample", "domain_debug"})
public abstract interface ExampleRepository extends com.example.gentrier.domain.repository.BaseRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.gentrier.domain.model.Example>> getAllExamples();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExampleById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.Example> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addExample(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.Example example, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateExample(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.Example example, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteExample(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.Example example, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object syncExamples(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.util.Resource<? extends java.util.List<com.example.gentrier.domain.model.Example>>> $completion);
}