package com.example.gentrier.data.repository;

import com.example.gentrier.data.local.dao.LocationPointDao;
import com.example.gentrier.data.local.dao.SkiSessionDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class SkiSessionRepositoryImpl_Factory implements Factory<SkiSessionRepositoryImpl> {
  private final Provider<SkiSessionDao> skiSessionDaoProvider;

  private final Provider<LocationPointDao> locationPointDaoProvider;

  public SkiSessionRepositoryImpl_Factory(Provider<SkiSessionDao> skiSessionDaoProvider,
      Provider<LocationPointDao> locationPointDaoProvider) {
    this.skiSessionDaoProvider = skiSessionDaoProvider;
    this.locationPointDaoProvider = locationPointDaoProvider;
  }

  @Override
  public SkiSessionRepositoryImpl get() {
    return newInstance(skiSessionDaoProvider.get(), locationPointDaoProvider.get());
  }

  public static SkiSessionRepositoryImpl_Factory create(
      Provider<SkiSessionDao> skiSessionDaoProvider,
      Provider<LocationPointDao> locationPointDaoProvider) {
    return new SkiSessionRepositoryImpl_Factory(skiSessionDaoProvider, locationPointDaoProvider);
  }

  public static SkiSessionRepositoryImpl newInstance(SkiSessionDao skiSessionDao,
      LocationPointDao locationPointDao) {
    return new SkiSessionRepositoryImpl(skiSessionDao, locationPointDao);
  }
}
