package com.example.gentrier.data.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.example.gentrier.domain.repository.ExampleRepository;
import dagger.internal.DaggerGenerated;
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
public final class ExampleSyncWorker_Factory {
  private final Provider<ExampleRepository> repositoryProvider;

  public ExampleSyncWorker_Factory(Provider<ExampleRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public ExampleSyncWorker get(Context appContext, WorkerParameters workerParams) {
    return newInstance(appContext, workerParams, repositoryProvider.get());
  }

  public static ExampleSyncWorker_Factory create(Provider<ExampleRepository> repositoryProvider) {
    return new ExampleSyncWorker_Factory(repositoryProvider);
  }

  public static ExampleSyncWorker newInstance(Context appContext, WorkerParameters workerParams,
      ExampleRepository repository) {
    return new ExampleSyncWorker(appContext, workerParams, repository);
  }
}
