package com.example.gentrier.domain.usecase;

import com.example.gentrier.domain.repository.ExampleRepository;
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
public final class SyncExamplesUseCase_Factory implements Factory<SyncExamplesUseCase> {
  private final Provider<ExampleRepository> repositoryProvider;

  public SyncExamplesUseCase_Factory(Provider<ExampleRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SyncExamplesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static SyncExamplesUseCase_Factory create(Provider<ExampleRepository> repositoryProvider) {
    return new SyncExamplesUseCase_Factory(repositoryProvider);
  }

  public static SyncExamplesUseCase newInstance(ExampleRepository repository) {
    return new SyncExamplesUseCase(repository);
  }
}
