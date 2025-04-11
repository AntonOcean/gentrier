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
public final class GetAllExamplesUseCase_Factory implements Factory<GetAllExamplesUseCase> {
  private final Provider<ExampleRepository> repositoryProvider;

  public GetAllExamplesUseCase_Factory(Provider<ExampleRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetAllExamplesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetAllExamplesUseCase_Factory create(
      Provider<ExampleRepository> repositoryProvider) {
    return new GetAllExamplesUseCase_Factory(repositoryProvider);
  }

  public static GetAllExamplesUseCase newInstance(ExampleRepository repository) {
    return new GetAllExamplesUseCase(repository);
  }
}
