package com.example.gentrier.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000eH\u0016J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/gentrier/data/repository/ExampleRepositoryImpl;", "Lcom/example/gentrier/domain/repository/ExampleRepository;", "exampleDao", "Lcom/example/gentrier/data/local/dao/ExampleDao;", "apiService", "Lcom/example/gentrier/data/remote/ApiService;", "(Lcom/example/gentrier/data/local/dao/ExampleDao;Lcom/example/gentrier/data/remote/ApiService;)V", "addExample", "", "example", "Lcom/example/gentrier/domain/model/Example;", "(Lcom/example/gentrier/domain/model/Example;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteExample", "getAllExamples", "Lkotlinx/coroutines/flow/Flow;", "", "getExampleById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncExamples", "Lcom/example/gentrier/domain/util/Resource;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateExample", "data_release"})
public final class ExampleRepositoryImpl implements com.example.gentrier.domain.repository.ExampleRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.data.local.dao.ExampleDao exampleDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gentrier.data.remote.ApiService apiService = null;
    
    @javax.inject.Inject()
    public ExampleRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.dao.ExampleDao exampleDao, @org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.remote.ApiService apiService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.gentrier.domain.model.Example>> getAllExamples() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getExampleById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.model.Example> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addExample(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.Example example, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateExample(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.Example example, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteExample(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.domain.model.Example example, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object syncExamples(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.gentrier.domain.util.Resource<? extends java.util.List<com.example.gentrier.domain.model.Example>>> $completion) {
        return null;
    }
}