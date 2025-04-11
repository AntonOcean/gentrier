package com.example.gentrier.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/gentrier/data/local/SkiTrackerDatabase;", "Landroidx/room/RoomDatabase;", "()V", "locationPointDao", "Lcom/example/gentrier/data/local/dao/LocationPointDao;", "skiSessionDao", "Lcom/example/gentrier/data/local/dao/SkiSessionDao;", "data_debug"})
@androidx.room.Database(entities = {com.example.gentrier.data.local.entity.SkiSessionEntity.class, com.example.gentrier.data.local.entity.LocationPointEntity.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.example.gentrier.data.local.converter.DateTimeConverters.class})
public abstract class SkiTrackerDatabase extends androidx.room.RoomDatabase {
    
    public SkiTrackerDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gentrier.data.local.dao.SkiSessionDao skiSessionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gentrier.data.local.dao.LocationPointDao locationPointDao();
}