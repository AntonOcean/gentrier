package com.example.gentrier.presentation.feature.session.active;

import com.example.gentrier.domain.usecase.location.GetLocationUpdatesUseCase;
import com.example.gentrier.domain.usecase.ski.EndSkiSessionUseCase;
import com.example.gentrier.domain.usecase.ski.GetActiveSessionUseCase;
import com.example.gentrier.domain.usecase.ski.StartSkiSessionUseCase;
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
public final class ActiveSessionViewModel_Factory implements Factory<ActiveSessionViewModel> {
  private final Provider<StartSkiSessionUseCase> startSkiSessionUseCaseProvider;

  private final Provider<EndSkiSessionUseCase> endSkiSessionUseCaseProvider;

  private final Provider<GetActiveSessionUseCase> getActiveSessionUseCaseProvider;

  private final Provider<GetLocationUpdatesUseCase> getLocationUpdatesUseCaseProvider;

  public ActiveSessionViewModel_Factory(
      Provider<StartSkiSessionUseCase> startSkiSessionUseCaseProvider,
      Provider<EndSkiSessionUseCase> endSkiSessionUseCaseProvider,
      Provider<GetActiveSessionUseCase> getActiveSessionUseCaseProvider,
      Provider<GetLocationUpdatesUseCase> getLocationUpdatesUseCaseProvider) {
    this.startSkiSessionUseCaseProvider = startSkiSessionUseCaseProvider;
    this.endSkiSessionUseCaseProvider = endSkiSessionUseCaseProvider;
    this.getActiveSessionUseCaseProvider = getActiveSessionUseCaseProvider;
    this.getLocationUpdatesUseCaseProvider = getLocationUpdatesUseCaseProvider;
  }

  @Override
  public ActiveSessionViewModel get() {
    return newInstance(startSkiSessionUseCaseProvider.get(), endSkiSessionUseCaseProvider.get(), getActiveSessionUseCaseProvider.get(), getLocationUpdatesUseCaseProvider.get());
  }

  public static ActiveSessionViewModel_Factory create(
      Provider<StartSkiSessionUseCase> startSkiSessionUseCaseProvider,
      Provider<EndSkiSessionUseCase> endSkiSessionUseCaseProvider,
      Provider<GetActiveSessionUseCase> getActiveSessionUseCaseProvider,
      Provider<GetLocationUpdatesUseCase> getLocationUpdatesUseCaseProvider) {
    return new ActiveSessionViewModel_Factory(startSkiSessionUseCaseProvider, endSkiSessionUseCaseProvider, getActiveSessionUseCaseProvider, getLocationUpdatesUseCaseProvider);
  }

  public static ActiveSessionViewModel newInstance(StartSkiSessionUseCase startSkiSessionUseCase,
      EndSkiSessionUseCase endSkiSessionUseCase, GetActiveSessionUseCase getActiveSessionUseCase,
      GetLocationUpdatesUseCase getLocationUpdatesUseCase) {
    return new ActiveSessionViewModel(startSkiSessionUseCase, endSkiSessionUseCase, getActiveSessionUseCase, getLocationUpdatesUseCase);
  }
}
