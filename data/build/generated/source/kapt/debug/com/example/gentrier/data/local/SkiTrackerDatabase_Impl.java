package com.example.gentrier.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.example.gentrier.data.local.dao.LocationPointDao;
import com.example.gentrier.data.local.dao.LocationPointDao_Impl;
import com.example.gentrier.data.local.dao.SkiSessionDao;
import com.example.gentrier.data.local.dao.SkiSessionDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SkiTrackerDatabase_Impl extends SkiTrackerDatabase {
  private volatile SkiSessionDao _skiSessionDao;

  private volatile LocationPointDao _locationPointDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `ski_sessions` (`id` TEXT NOT NULL, `startTime` TEXT NOT NULL, `endTime` TEXT, `distance` REAL NOT NULL, `maxSpeed` REAL NOT NULL, `avgSpeed` REAL NOT NULL, `elevationGain` REAL NOT NULL, `elevationLoss` REAL NOT NULL, `isActive` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `location_points` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sessionId` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL, `speed` REAL NOT NULL, `timestamp` TEXT NOT NULL, FOREIGN KEY(`sessionId`) REFERENCES `ski_sessions`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_location_points_sessionId` ON `location_points` (`sessionId`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b5e4bd758fa7bc8b93fe8306d8913f0b')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `ski_sessions`");
        db.execSQL("DROP TABLE IF EXISTS `location_points`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsSkiSessions = new HashMap<String, TableInfo.Column>(9);
        _columnsSkiSessions.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("startTime", new TableInfo.Column("startTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("endTime", new TableInfo.Column("endTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("distance", new TableInfo.Column("distance", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("maxSpeed", new TableInfo.Column("maxSpeed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("avgSpeed", new TableInfo.Column("avgSpeed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("elevationGain", new TableInfo.Column("elevationGain", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("elevationLoss", new TableInfo.Column("elevationLoss", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSkiSessions.put("isActive", new TableInfo.Column("isActive", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSkiSessions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSkiSessions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSkiSessions = new TableInfo("ski_sessions", _columnsSkiSessions, _foreignKeysSkiSessions, _indicesSkiSessions);
        final TableInfo _existingSkiSessions = TableInfo.read(db, "ski_sessions");
        if (!_infoSkiSessions.equals(_existingSkiSessions)) {
          return new RoomOpenHelper.ValidationResult(false, "ski_sessions(com.example.gentrier.data.local.entity.SkiSessionEntity).\n"
                  + " Expected:\n" + _infoSkiSessions + "\n"
                  + " Found:\n" + _existingSkiSessions);
        }
        final HashMap<String, TableInfo.Column> _columnsLocationPoints = new HashMap<String, TableInfo.Column>(7);
        _columnsLocationPoints.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationPoints.put("sessionId", new TableInfo.Column("sessionId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationPoints.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationPoints.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationPoints.put("altitude", new TableInfo.Column("altitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationPoints.put("speed", new TableInfo.Column("speed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationPoints.put("timestamp", new TableInfo.Column("timestamp", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocationPoints = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysLocationPoints.add(new TableInfo.ForeignKey("ski_sessions", "CASCADE", "NO ACTION", Arrays.asList("sessionId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesLocationPoints = new HashSet<TableInfo.Index>(1);
        _indicesLocationPoints.add(new TableInfo.Index("index_location_points_sessionId", false, Arrays.asList("sessionId"), Arrays.asList("ASC")));
        final TableInfo _infoLocationPoints = new TableInfo("location_points", _columnsLocationPoints, _foreignKeysLocationPoints, _indicesLocationPoints);
        final TableInfo _existingLocationPoints = TableInfo.read(db, "location_points");
        if (!_infoLocationPoints.equals(_existingLocationPoints)) {
          return new RoomOpenHelper.ValidationResult(false, "location_points(com.example.gentrier.data.local.entity.LocationPointEntity).\n"
                  + " Expected:\n" + _infoLocationPoints + "\n"
                  + " Found:\n" + _existingLocationPoints);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "b5e4bd758fa7bc8b93fe8306d8913f0b", "8faca453a786c36ab96294699e0bc4aa");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ski_sessions","location_points");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `ski_sessions`");
      _db.execSQL("DELETE FROM `location_points`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SkiSessionDao.class, SkiSessionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LocationPointDao.class, LocationPointDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public SkiSessionDao skiSessionDao() {
    if (_skiSessionDao != null) {
      return _skiSessionDao;
    } else {
      synchronized(this) {
        if(_skiSessionDao == null) {
          _skiSessionDao = new SkiSessionDao_Impl(this);
        }
        return _skiSessionDao;
      }
    }
  }

  @Override
  public LocationPointDao locationPointDao() {
    if (_locationPointDao != null) {
      return _locationPointDao;
    } else {
      synchronized(this) {
        if(_locationPointDao == null) {
          _locationPointDao = new LocationPointDao_Impl(this);
        }
        return _locationPointDao;
      }
    }
  }
}
