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
public final class GetAllSessionsUseCase_Factory implements Factory<GetAllSessionsUseCase> {
  private final Provider<SkiSessionRepository> skiSessionRepositoryProvider;

  public GetAllSessionsUseCase_Factory(
      Provider<SkiSessionRepository> skiSessionRepositoryProvider) {
    this.skiSessionRepositoryProvider = skiSessionRepositoryProvider;
  }

  @Override
  public GetAllSessionsUseCase get() {
    return newInstance(skiSessionRepositoryProvider.get());
  }

  public static GetAllSessionsUseCase_Factory create(
      Provider<SkiSessionRepository> skiSessionRepositoryProvider) {
    return new GetAllSessionsUseCase_Factory(skiSessionRepositoryProvider);
  }

  public static GetAllSessionsUseCase newInstance(SkiSessionRepository skiSessionRepository) {
    return new GetAllSessionsUseCase(skiSessionRepository);
  }
}
