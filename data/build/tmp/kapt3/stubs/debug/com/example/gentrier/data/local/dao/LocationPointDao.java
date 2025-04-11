package com.example.gentrier.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/gentrier/data/local/dao/LocationPointDao;", "", "getLocationPointsForSession", "", "Lcom/example/gentrier/data/local/entity/LocationPointEntity;", "sessionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocationPoint", "", "locationPoint", "(Lcom/example/gentrier/data/local/entity/LocationPointEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
@androidx.room.Dao()
public abstract interface LocationPointDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLocationPoint(@org.jetbrains.annotations.NotNull()
    com.example.gentrier.data.local.entity.LocationPointEntity locationPoint, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM location_points WHERE sessionId = :sessionId ORDER BY timestamp ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLocationPointsForSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.gentrier.data.local.entity.LocationPointEntity>> $completion);
}