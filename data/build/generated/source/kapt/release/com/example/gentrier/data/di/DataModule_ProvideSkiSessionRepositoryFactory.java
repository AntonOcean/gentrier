package com.example.gentrier.data.di;

import com.example.gentrier.data.local.dao.LocationPointDao;
import com.example.gentrier.data.local.dao.SkiSessionDao;
import com.example.gentrier.domain.repository.SkiSessionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DataModule_ProvideSkiSessionRepositoryFactory implements Factory<SkiSessionRepository> {
  private final Provider<SkiSessionDao> skiSessionDaoProvider;

  private final Provider<LocationPointDao> locationPointDaoProvider;

  public DataModule_ProvideSkiSessionRepositoryFactory(
      Provider<SkiSessionDao> skiSessionDaoProvider,
      Provider<LocationPointDao> locationPointDaoProvider) {
    this.skiSessionDaoProvider = skiSessionDaoProvider;
    this.locationPointDaoProvider = locationPointDaoProvider;
  }

  @Override
  public SkiSessionRepository get() {
    return provideSkiSessionRepository(skiSessionDaoProvider.get(), locationPointDaoProvider.get());
  }

  public static DataModule_ProvideSkiSessionRepositoryFactory create(
      Provider<SkiSessionDao> skiSessionDaoProvider,
      Provider<LocationPointDao> locationPointDaoProvider) {
    return new DataModule_ProvideSkiSessionRepositoryFactory(skiSessionDaoProvider, locationPointDaoProvider);
  }

  public static SkiSessionRepository provideSkiSessionRepository(SkiSessionDao skiSessionDao,
      LocationPointDao locationPointDao) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideSkiSessionRepository(skiSessionDao, locationPointDao));
  }
}
