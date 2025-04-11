package com.example.gentrier.domain.usecase.ski;

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
public final class GetActiveSessionUseCase_Factory implements Factory<GetActiveSessionUseCase> {
  private final Provider<SkiSessionRepository> skiSessionRepositoryProvider;

  public GetActiveSessionUseCase_Factory(
      Provider<SkiSessionRepository> skiSessionRepositoryProvider) {
    this.skiSessionRepositoryProvider = skiSessionRepositoryProvider;
  }

  @Override
  public GetActiveSessionUseCase get() {
    return newInstance(skiSessionRepositoryProvider.get());
  }

  public static GetActiveSessionUseCase_Factory create(
      Provider<SkiSessionRepository> skiSessionRepositoryProvider) {
    return new GetActiveSessionUseCase_Factory(skiSessionRepositoryProvider);
  }

  public static GetActiveSessionUseCase newInstance(SkiSessionRepository skiSessionRepository) {
    return new GetActiveSessionUseCase(skiSessionRepository);
  }
}
