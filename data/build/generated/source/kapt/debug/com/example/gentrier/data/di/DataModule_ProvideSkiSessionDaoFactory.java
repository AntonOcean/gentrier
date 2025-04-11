package com.example.gentrier.data.di;

import com.example.gentrier.data.local.SkiTrackerDatabase;
import com.example.gentrier.data.local.dao.SkiSessionDao;
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
public final class DataModule_ProvideSkiSessionDaoFactory implements Factory<SkiSessionDao> {
  private final Provider<SkiTrackerDatabase> databaseProvider;

  public DataModule_ProvideSkiSessionDaoFactory(Provider<SkiTrackerDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public SkiSessionDao get() {
    return provideSkiSessionDao(databaseProvider.get());
  }

  public static DataModule_ProvideSkiSessionDaoFactory create(
      Provider<SkiTrackerDatabase> databaseProvider) {
    return new DataModule_ProvideSkiSessionDaoFactory(databaseProvider);
  }

  public static SkiSessionDao provideSkiSessionDao(SkiTrackerDatabase database) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideSkiSessionDao(database));
  }
}
