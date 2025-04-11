package com.example.gentrier.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.gentrier.data.local.converter.DateTimeConverters;
import com.example.gentrier.data.local.entity.LocationPointEntity;
import com.example.gentrier.data.local.entity.SkiSessionEntity;
import com.example.gentrier.data.local.relation.SkiSessionWithLocationPoints;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SkiSessionDao_Impl implements SkiSessionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SkiSessionEntity> __insertionAdapterOfSkiSessionEntity;

  private final DateTimeConverters __dateTimeConverters = new DateTimeConverters();

  private final EntityDeletionOrUpdateAdapter<SkiSessionEntity> __updateAdapterOfSkiSessionEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSession;

  public SkiSessionDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSkiSessionEntity = new EntityInsertionAdapter<SkiSessionEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `ski_sessions` (`id`,`startTime`,`endTime`,`distance`,`maxSpeed`,`avgSpeed`,`elevationGain`,`elevationLoss`,`isActive`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SkiSessionEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        final String _tmp = __dateTimeConverters.toString(entity.getStartTime());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        final String _tmp_1 = __dateTimeConverters.toString(entity.getEndTime());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, _tmp_1);
        }
        statement.bindDouble(4, entity.getDistance());
        statement.bindDouble(5, entity.getMaxSpeed());
        statement.bindDouble(6, entity.getAvgSpeed());
        statement.bindDouble(7, entity.getElevationGain());
        statement.bindDouble(8, entity.getElevationLoss());
        final int _tmp_2 = entity.isActive() ? 1 : 0;
        statement.bindLong(9, _tmp_2);
      }
    };
    this.__updateAdapterOfSkiSessionEntity = new EntityDeletionOrUpdateAdapter<SkiSessionEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `ski_sessions` SET `id` = ?,`startTime` = ?,`endTime` = ?,`distance` = ?,`maxSpeed` = ?,`avgSpeed` = ?,`elevationGain` = ?,`elevationLoss` = ?,`isActive` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SkiSessionEntity entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getId());
        }
        final String _tmp = __dateTimeConverters.toString(entity.getStartTime());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, _tmp);
        }
        final String _tmp_1 = __dateTimeConverters.toString(entity.getEndTime());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, _tmp_1);
        }
        statement.bindDouble(4, entity.getDistance());
        statement.bindDouble(5, entity.getMaxSpeed());
        statement.bindDouble(6, entity.getAvgSpeed());
        statement.bindDouble(7, entity.getElevationGain());
        statement.bindDouble(8, entity.getElevationLoss());
        final int _tmp_2 = entity.isActive() ? 1 : 0;
        statement.bindLong(9, _tmp_2);
        if (entity.getId() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteSession = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ski_sessions WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertSession(final SkiSessionEntity session,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfSkiSessionEntity.insertAndReturnId(session);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSession(final SkiSessionEntity session,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSkiSessionEntity.handle(session);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteSession(final String sessionId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSession.acquire();
        int _argIndex = 1;
        if (sessionId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, sessionId);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteSession.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getSessionById(final String sessionId,
      final Continuation<? super SkiSessionEntity> $completion) {
    final String _sql = "SELECT * FROM ski_sessions WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sessionId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sessionId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<SkiSessionEntity>() {
      @Override
      @Nullable
      public SkiSessionEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "distance");
          final int _cursorIndexOfMaxSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "maxSpeed");
          final int _cursorIndexOfAvgSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeed");
          final int _cursorIndexOfElevationGain = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationGain");
          final int _cursorIndexOfElevationLoss = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationLoss");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final SkiSessionEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final LocalDateTime _tmpStartTime;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __dateTimeConverters.fromString(_tmp);
            final LocalDateTime _tmpEndTime;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __dateTimeConverters.fromString(_tmp_1);
            final float _tmpDistance;
            _tmpDistance = _cursor.getFloat(_cursorIndexOfDistance);
            final float _tmpMaxSpeed;
            _tmpMaxSpeed = _cursor.getFloat(_cursorIndexOfMaxSpeed);
            final float _tmpAvgSpeed;
            _tmpAvgSpeed = _cursor.getFloat(_cursorIndexOfAvgSpeed);
            final float _tmpElevationGain;
            _tmpElevationGain = _cursor.getFloat(_cursorIndexOfElevationGain);
            final float _tmpElevationLoss;
            _tmpElevationLoss = _cursor.getFloat(_cursorIndexOfElevationLoss);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            _result = new SkiSessionEntity(_tmpId,_tmpStartTime,_tmpEndTime,_tmpDistance,_tmpMaxSpeed,_tmpAvgSpeed,_tmpElevationGain,_tmpElevationLoss,_tmpIsActive);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<SkiSessionEntity> getActiveSession() {
    final String _sql = "SELECT * FROM ski_sessions WHERE isActive = 1 LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"ski_sessions"}, new Callable<SkiSessionEntity>() {
      @Override
      @Nullable
      public SkiSessionEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "distance");
          final int _cursorIndexOfMaxSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "maxSpeed");
          final int _cursorIndexOfAvgSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeed");
          final int _cursorIndexOfElevationGain = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationGain");
          final int _cursorIndexOfElevationLoss = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationLoss");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final SkiSessionEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final LocalDateTime _tmpStartTime;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __dateTimeConverters.fromString(_tmp);
            final LocalDateTime _tmpEndTime;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __dateTimeConverters.fromString(_tmp_1);
            final float _tmpDistance;
            _tmpDistance = _cursor.getFloat(_cursorIndexOfDistance);
            final float _tmpMaxSpeed;
            _tmpMaxSpeed = _cursor.getFloat(_cursorIndexOfMaxSpeed);
            final float _tmpAvgSpeed;
            _tmpAvgSpeed = _cursor.getFloat(_cursorIndexOfAvgSpeed);
            final float _tmpElevationGain;
            _tmpElevationGain = _cursor.getFloat(_cursorIndexOfElevationGain);
            final float _tmpElevationLoss;
            _tmpElevationLoss = _cursor.getFloat(_cursorIndexOfElevationLoss);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            _result = new SkiSessionEntity(_tmpId,_tmpStartTime,_tmpEndTime,_tmpDistance,_tmpMaxSpeed,_tmpAvgSpeed,_tmpElevationGain,_tmpElevationLoss,_tmpIsActive);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<SkiSessionEntity>> getAllSessions() {
    final String _sql = "SELECT * FROM ski_sessions ORDER BY startTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"ski_sessions"}, new Callable<List<SkiSessionEntity>>() {
      @Override
      @NonNull
      public List<SkiSessionEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "distance");
          final int _cursorIndexOfMaxSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "maxSpeed");
          final int _cursorIndexOfAvgSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeed");
          final int _cursorIndexOfElevationGain = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationGain");
          final int _cursorIndexOfElevationLoss = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationLoss");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final List<SkiSessionEntity> _result = new ArrayList<SkiSessionEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final SkiSessionEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final LocalDateTime _tmpStartTime;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfStartTime)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfStartTime);
            }
            _tmpStartTime = __dateTimeConverters.fromString(_tmp);
            final LocalDateTime _tmpEndTime;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfEndTime)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfEndTime);
            }
            _tmpEndTime = __dateTimeConverters.fromString(_tmp_1);
            final float _tmpDistance;
            _tmpDistance = _cursor.getFloat(_cursorIndexOfDistance);
            final float _tmpMaxSpeed;
            _tmpMaxSpeed = _cursor.getFloat(_cursorIndexOfMaxSpeed);
            final float _tmpAvgSpeed;
            _tmpAvgSpeed = _cursor.getFloat(_cursorIndexOfAvgSpeed);
            final float _tmpElevationGain;
            _tmpElevationGain = _cursor.getFloat(_cursorIndexOfElevationGain);
            final float _tmpElevationLoss;
            _tmpElevationLoss = _cursor.getFloat(_cursorIndexOfElevationLoss);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            _item = new SkiSessionEntity(_tmpId,_tmpStartTime,_tmpEndTime,_tmpDistance,_tmpMaxSpeed,_tmpAvgSpeed,_tmpElevationGain,_tmpElevationLoss,_tmpIsActive);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getSessionWithLocationPoints(final String sessionId,
      final Continuation<? super SkiSessionWithLocationPoints> $completion) {
    final String _sql = "SELECT * FROM ski_sessions WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sessionId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sessionId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<SkiSessionWithLocationPoints>() {
      @Override
      @Nullable
      public SkiSessionWithLocationPoints call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
            final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
            final int _cursorIndexOfDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "distance");
            final int _cursorIndexOfMaxSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "maxSpeed");
            final int _cursorIndexOfAvgSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeed");
            final int _cursorIndexOfElevationGain = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationGain");
            final int _cursorIndexOfElevationLoss = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationLoss");
            final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
            final ArrayMap<String, ArrayList<LocationPointEntity>> _collectionLocationPoints = new ArrayMap<String, ArrayList<LocationPointEntity>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpKey = null;
              } else {
                _tmpKey = _cursor.getString(_cursorIndexOfId);
              }
              if (_tmpKey != null) {
                if (!_collectionLocationPoints.containsKey(_tmpKey)) {
                  _collectionLocationPoints.put(_tmpKey, new ArrayList<LocationPointEntity>());
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiplocationPointsAscomExampleGentrierDataLocalEntityLocationPointEntity(_collectionLocationPoints);
            final SkiSessionWithLocationPoints _result;
            if (_cursor.moveToFirst()) {
              final SkiSessionEntity _tmpSession;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final LocalDateTime _tmpStartTime;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfStartTime)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfStartTime);
              }
              _tmpStartTime = __dateTimeConverters.fromString(_tmp);
              final LocalDateTime _tmpEndTime;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfEndTime)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfEndTime);
              }
              _tmpEndTime = __dateTimeConverters.fromString(_tmp_1);
              final float _tmpDistance;
              _tmpDistance = _cursor.getFloat(_cursorIndexOfDistance);
              final float _tmpMaxSpeed;
              _tmpMaxSpeed = _cursor.getFloat(_cursorIndexOfMaxSpeed);
              final float _tmpAvgSpeed;
              _tmpAvgSpeed = _cursor.getFloat(_cursorIndexOfAvgSpeed);
              final float _tmpElevationGain;
              _tmpElevationGain = _cursor.getFloat(_cursorIndexOfElevationGain);
              final float _tmpElevationLoss;
              _tmpElevationLoss = _cursor.getFloat(_cursorIndexOfElevationLoss);
              final boolean _tmpIsActive;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
              _tmpIsActive = _tmp_2 != 0;
              _tmpSession = new SkiSessionEntity(_tmpId,_tmpStartTime,_tmpEndTime,_tmpDistance,_tmpMaxSpeed,_tmpAvgSpeed,_tmpElevationGain,_tmpElevationLoss,_tmpIsActive);
              final ArrayList<LocationPointEntity> _tmpLocationPointsCollection;
              final String _tmpKey_1;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpKey_1 = null;
              } else {
                _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
              }
              if (_tmpKey_1 != null) {
                _tmpLocationPointsCollection = _collectionLocationPoints.get(_tmpKey_1);
              } else {
                _tmpLocationPointsCollection = new ArrayList<LocationPointEntity>();
              }
              _result = new SkiSessionWithLocationPoints(_tmpSession,_tmpLocationPointsCollection);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<SkiSessionWithLocationPoints>> getAllSessionsWithLocationPoints() {
    final String _sql = "SELECT * FROM ski_sessions ORDER BY startTime DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[] {"location_points",
        "ski_sessions"}, new Callable<List<SkiSessionWithLocationPoints>>() {
      @Override
      @NonNull
      public List<SkiSessionWithLocationPoints> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
            final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
            final int _cursorIndexOfDistance = CursorUtil.getColumnIndexOrThrow(_cursor, "distance");
            final int _cursorIndexOfMaxSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "maxSpeed");
            final int _cursorIndexOfAvgSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "avgSpeed");
            final int _cursorIndexOfElevationGain = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationGain");
            final int _cursorIndexOfElevationLoss = CursorUtil.getColumnIndexOrThrow(_cursor, "elevationLoss");
            final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
            final ArrayMap<String, ArrayList<LocationPointEntity>> _collectionLocationPoints = new ArrayMap<String, ArrayList<LocationPointEntity>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpKey = null;
              } else {
                _tmpKey = _cursor.getString(_cursorIndexOfId);
              }
              if (_tmpKey != null) {
                if (!_collectionLocationPoints.containsKey(_tmpKey)) {
                  _collectionLocationPoints.put(_tmpKey, new ArrayList<LocationPointEntity>());
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiplocationPointsAscomExampleGentrierDataLocalEntityLocationPointEntity(_collectionLocationPoints);
            final List<SkiSessionWithLocationPoints> _result = new ArrayList<SkiSessionWithLocationPoints>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final SkiSessionWithLocationPoints _item;
              final SkiSessionEntity _tmpSession;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              final LocalDateTime _tmpStartTime;
              final String _tmp;
              if (_cursor.isNull(_cursorIndexOfStartTime)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getString(_cursorIndexOfStartTime);
              }
              _tmpStartTime = __dateTimeConverters.fromString(_tmp);
              final LocalDateTime _tmpEndTime;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfEndTime)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfEndTime);
              }
              _tmpEndTime = __dateTimeConverters.fromString(_tmp_1);
              final float _tmpDistance;
              _tmpDistance = _cursor.getFloat(_cursorIndexOfDistance);
              final float _tmpMaxSpeed;
              _tmpMaxSpeed = _cursor.getFloat(_cursorIndexOfMaxSpeed);
              final float _tmpAvgSpeed;
              _tmpAvgSpeed = _cursor.getFloat(_cursorIndexOfAvgSpeed);
              final float _tmpElevationGain;
              _tmpElevationGain = _cursor.getFloat(_cursorIndexOfElevationGain);
              final float _tmpElevationLoss;
              _tmpElevationLoss = _cursor.getFloat(_cursorIndexOfElevationLoss);
              final boolean _tmpIsActive;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
              _tmpIsActive = _tmp_2 != 0;
              _tmpSession = new SkiSessionEntity(_tmpId,_tmpStartTime,_tmpEndTime,_tmpDistance,_tmpMaxSpeed,_tmpAvgSpeed,_tmpElevationGain,_tmpElevationLoss,_tmpIsActive);
              final ArrayList<LocationPointEntity> _tmpLocationPointsCollection;
              final String _tmpKey_1;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpKey_1 = null;
              } else {
                _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
              }
              if (_tmpKey_1 != null) {
                _tmpLocationPointsCollection = _collectionLocationPoints.get(_tmpKey_1);
              } else {
                _tmpLocationPointsCollection = new ArrayList<LocationPointEntity>();
              }
              _item = new SkiSessionWithLocationPoints(_tmpSession,_tmpLocationPointsCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshiplocationPointsAscomExampleGentrierDataLocalEntityLocationPointEntity(
      @NonNull final ArrayMap<String, ArrayList<LocationPointEntity>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    if (_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      RelationUtil.recursiveFetchArrayMap(_map, true, (map) -> {
        __fetchRelationshiplocationPointsAscomExampleGentrierDataLocalEntityLocationPointEntity(map);
        return Unit.INSTANCE;
      });
      return;
    }
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`sessionId`,`latitude`,`longitude`,`altitude`,`speed`,`timestamp` FROM `location_points` WHERE `sessionId` IN (");
    final int _inputSize = __mapKeySet == null ? 1 : __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    if (__mapKeySet == null) {
      _stmt.bindNull(_argIndex);
    } else {
      for (String _item : __mapKeySet) {
        if (_item == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, _item);
        }
        _argIndex++;
      }
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "sessionId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfSessionId = 1;
      final int _cursorIndexOfLatitude = 2;
      final int _cursorIndexOfLongitude = 3;
      final int _cursorIndexOfAltitude = 4;
      final int _cursorIndexOfSpeed = 5;
      final int _cursorIndexOfTimestamp = 6;
      while (_cursor.moveToNext()) {
        final String _tmpKey;
        if (_cursor.isNull(_itemKeyIndex)) {
          _tmpKey = null;
        } else {
          _tmpKey = _cursor.getString(_itemKeyIndex);
        }
        if (_tmpKey != null) {
          final ArrayList<LocationPointEntity> _tmpRelation = _map.get(_tmpKey);
          if (_tmpRelation != null) {
            final LocationPointEntity _item_1;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpSessionId;
            if (_cursor.isNull(_cursorIndexOfSessionId)) {
              _tmpSessionId = null;
            } else {
              _tmpSessionId = _cursor.getString(_cursorIndexOfSessionId);
            }
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final double _tmpAltitude;
            _tmpAltitude = _cursor.getDouble(_cursorIndexOfAltitude);
            final float _tmpSpeed;
            _tmpSpeed = _cursor.getFloat(_cursorIndexOfSpeed);
            final LocalDateTime _tmpTimestamp;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __dateTimeConverters.fromString(_tmp);
            _item_1 = new LocationPointEntity(_tmpId,_tmpSessionId,_tmpLatitude,_tmpLongitude,_tmpAltitude,_tmpSpeed,_tmpTimestamp);
            _tmpRelation.add(_item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
