package com.example.gentrier.domain.usecase.location;

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
public final class GetLocationUpdatesUseCase_Factory implements Factory<GetLocationUpdatesUseCase> {
  private final Provider<LocationTrackingRepository> locationTrackingRepositoryProvider;

  private final Provider<SkiSessionRepository> skiSessionRepositoryProvider;

  public GetLocationUpdatesUseCase_Factory(
      Provider<LocationTrackingRepository> locationTrackingRepositoryProvider,
      Provider<SkiSessionRepository> skiSessionRepositoryProvider) {
    this.locationTrackingRepositoryProvider = locationTrackingRepositoryProvider;
    this.skiSessionRepositoryProvider = skiSessionRepositoryProvider;
  }

  @Override
  public GetLocationUpdatesUseCase get() {
    return newInstance(locationTrackingRepositoryProvider.get(), skiSessionRepositoryProvider.get());
  }

  public static GetLocationUpdatesUseCase_Factory create(
      Provider<LocationTrackingRepository> locationTrackingRepositoryProvider,
      Provider<SkiSessionRepository> skiSessionRepositoryProvider) {
    return new GetLocationUpdatesUseCase_Factory(locationTrackingRepositoryProvider, skiSessionRepositoryProvider);
  }

  public static GetLocationUpdatesUseCase newInstance(
      LocationTrackingRepository locationTrackingRepository,
      SkiSessionRepository skiSessionRepository) {
    return new GetLocationUpdatesUseCase(locationTrackingRepository, skiSessionRepository);
  }
}
