package com.example.gentrier.presentation.feature.session.detail;

import androidx.lifecycle.SavedStateHandle;
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
public final class SessionDetailViewModel_Factory implements Factory<SessionDetailViewModel> {
  private final Provider<SkiSessionRepository> skiSessionRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public SessionDetailViewModel_Factory(Provider<SkiSessionRepository> skiSessionRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.skiSessionRepositoryProvider = skiSessionRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public SessionDetailViewModel get() {
    return newInstance(skiSessionRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static SessionDetailViewModel_Factory create(
      Provider<SkiSessionRepository> skiSessionRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new SessionDetailViewModel_Factory(skiSessionRepositoryProvider, savedStateHandleProvider);
  }

  public static SessionDetailViewModel newInstance(SkiSessionRepository skiSessionRepository,
      SavedStateHandle savedStateHandle) {
    return new SessionDetailViewModel(skiSessionRepository, savedStateHandle);
  }
}
