package com.example.gentrier.presentation.feature.example;

import com.example.gentrier.domain.usecase.GetAllExamplesUseCase;
import com.example.gentrier.domain.usecase.SyncExamplesUseCase;
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
public final class ExampleViewModel_Factory implements Factory<ExampleViewModel> {
  private final Provider<GetAllExamplesUseCase> getAllExamplesUseCaseProvider;

  private final Provider<SyncExamplesUseCase> syncExamplesUseCaseProvider;

  public ExampleViewModel_Factory(Provider<GetAllExamplesUseCase> getAllExamplesUseCaseProvider,
      Provider<SyncExamplesUseCase> syncExamplesUseCaseProvider) {
    this.getAllExamplesUseCaseProvider = getAllExamplesUseCaseProvider;
    this.syncExamplesUseCaseProvider = syncExamplesUseCaseProvider;
  }

  @Override
  public ExampleViewModel get() {
    return newInstance(getAllExamplesUseCaseProvider.get(), syncExamplesUseCaseProvider.get());
  }

  public static ExampleViewModel_Factory create(
      Provider<GetAllExamplesUseCase> getAllExamplesUseCaseProvider,
      Provider<SyncExamplesUseCase> syncExamplesUseCaseProvider) {
    return new ExampleViewModel_Factory(getAllExamplesUseCaseProvider, syncExamplesUseCaseProvider);
  }

  public static ExampleViewModel newInstance(GetAllExamplesUseCase getAllExamplesUseCase,
      SyncExamplesUseCase syncExamplesUseCase) {
    return new ExampleViewModel(getAllExamplesUseCase, syncExamplesUseCase);
  }
}
