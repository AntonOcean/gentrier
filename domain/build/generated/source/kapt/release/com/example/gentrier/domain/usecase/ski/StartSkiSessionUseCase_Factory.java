package com.example.gentrier.domain.usecase.ski;

import com.example.gentrier.domain.repository.LocationTrackingRepository;
import com.example.gentrier.domain.repository.SkiSessionRepository;
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
public final class StartSkiSessionUseCase_Factory implements Factory<StartSkiSessionUseCase> {
  private final Provider<SkiSessionRepository> skiSessionRepositoryProvider;

  private final Provider<LocationTrackingRepository> locationTrackingRepositoryProvider;

  public StartSkiSessionUseCase_Factory(Provider<SkiSessionRepository> skiSessionRepositoryProvider,
      Provider<LocationTrackingRepository> locationTrackingRepositoryProvider) {
    this.skiSessionRepositoryProvider = skiSessionRepositoryProvider;
    this.locationTrackingRepositoryProvider = locationTrackingRepositoryProvider;
  }

  @Override
  public StartSkiSessionUseCase get() {
    return newInstance(skiSessionRepositoryProvider.get(), locationTrackingRepositoryProvider.get());
  }

  public static StartSkiSessionUseCase_Factory create(
      Provider<SkiSessionRepository> skiSessionRepositoryProvider,
      Provider<LocationTrackingRepository> locationTrackingRepositoryProvider) {
    return new StartSkiSessionUseCase_Factory(skiSessionRepositoryProvider, locationTrackingRepositoryProvider);
  }

  public static StartSkiSessionUseCase newInstance(SkiSessionRepository skiSessionRepository,
      LocationTrackingRepository locationTrackingRepository) {
    return new StartSkiSessionUseCase(skiSessionRepository, locationTrackingRepository);
  }
}
