package com.example.gentrier.presentation.feature.session.history;

import com.example.gentrier.domain.usecase.ski.GetAllSessionsUseCase;
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
public final class SessionHistoryViewModel_Factory implements Factory<SessionHistoryViewModel> {
  private final Provider<GetAllSessionsUseCase> getAllSessionsUseCaseProvider;

  public SessionHistoryViewModel_Factory(
      Provider<GetAllSessionsUseCase> getAllSessionsUseCaseProvider) {
    this.getAllSessionsUseCaseProvider = getAllSessionsUseCaseProvider;
  }

  @Override
  public SessionHistoryViewModel get() {
    return newInstance(getAllSessionsUseCaseProvider.get());
  }

  public static SessionHistoryViewModel_Factory create(
      Provider<GetAllSessionsUseCase> getAllSessionsUseCaseProvider) {
    return new SessionHistoryViewModel_Factory(getAllSessionsUseCaseProvider);
  }

  public static SessionHistoryViewModel newInstance(GetAllSessionsUseCase getAllSessionsUseCase) {
    return new SessionHistoryViewModel(getAllSessionsUseCase);
  }
}
