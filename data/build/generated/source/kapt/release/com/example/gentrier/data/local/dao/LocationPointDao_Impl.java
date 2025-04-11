package com.example.gentrier.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.gentrier.data.local.converter.DateTimeConverters;
import com.example.gentrier.data.local.entity.LocationPointEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class LocationPointDao_Impl implements LocationPointDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LocationPointEntity> __insertionAdapterOfLocationPointEntity;

  private final DateTimeConverters __dateTimeConverters = new DateTimeConverters();

  public LocationPointDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocationPointEntity = new EntityInsertionAdapter<LocationPointEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `location_points` (`id`,`sessionId`,`latitude`,`longitude`,`altitude`,`speed`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LocationPointEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getSessionId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getSessionId());
        }
        statement.bindDouble(3, entity.getLatitude());
        statement.bindDouble(4, entity.getLongitude());
        statement.bindDouble(5, entity.getAltitude());
        statement.bindDouble(6, entity.getSpeed());
        final String _tmp = __dateTimeConverters.toString(entity.getTimestamp());
        if (_tmp == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, _tmp);
        }
      }
    };
  }

  @Override
  public Object insertLocationPoint(final LocationPointEntity locationPoint,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfLocationPointEntity.insertAndReturnId(locationPoint);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getLocationPointsForSession(final String sessionId,
      final Continuation<? super List<LocationPointEntity>> $completion) {
    final String _sql = "SELECT * FROM location_points WHERE sessionId = ? ORDER BY timestamp ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sessionId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sessionId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<LocationPointEntity>>() {
      @Override
      @NonNull
      public List<LocationPointEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfAltitude = CursorUtil.getColumnIndexOrThrow(_cursor, "altitude");
          final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<LocationPointEntity> _result = new ArrayList<LocationPointEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final LocationPointEntity _item;
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
            _item = new LocationPointEntity(_tmpId,_tmpSessionId,_tmpLatitude,_tmpLongitude,_tmpAltitude,_tmpSpeed,_tmpTimestamp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
