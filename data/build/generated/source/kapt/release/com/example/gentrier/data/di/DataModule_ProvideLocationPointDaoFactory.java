package com.example.gentrier.data.di;

import com.example.gentrier.data.local.SkiTrackerDatabase;
import com.example.gentrier.data.local.dao.LocationPointDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DataModule_ProvideLocationPointDaoFactory implements Factory<LocationPointDao> {
  private final Provider<SkiTrackerDatabase> databaseProvider;

  public DataModule_ProvideLocationPointDaoFactory(Provider<SkiTrackerDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public LocationPointDao get() {
    return provideLocationPointDao(databaseProvider.get());
  }

  public static DataModule_ProvideLocationPointDaoFactory create(
      Provider<SkiTrackerDatabase> databaseProvider) {
    return new DataModule_ProvideLocationPointDaoFactory(databaseProvider);
  }

  public static LocationPointDao provideLocationPointDao(SkiTrackerDatabase database) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideLocationPointDao(database));
  }
}
