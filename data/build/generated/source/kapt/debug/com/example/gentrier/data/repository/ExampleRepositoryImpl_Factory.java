package com.example.gentrier.data.repository;

import com.example.gentrier.data.local.dao.ExampleDao;
import com.example.gentrier.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ExampleRepositoryImpl_Factory implements Factory<ExampleRepositoryImpl> {
  private final Provider<ExampleDao> exampleDaoProvider;

  private final Provider<ApiService> apiServiceProvider;

  public ExampleRepositoryImpl_Factory(Provider<ExampleDao> exampleDaoProvider,
      Provider<ApiService> apiServiceProvider) {
    this.exampleDaoProvider = exampleDaoProvider;
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ExampleRepositoryImpl get() {
    return newInstance(exampleDaoProvider.get(), apiServiceProvider.get());
  }

  public static ExampleRepositoryImpl_Factory create(Provider<ExampleDao> exampleDaoProvider,
      Provider<ApiService> apiServiceProvider) {
    return new ExampleRepositoryImpl_Factory(exampleDaoProvider, apiServiceProvider);
  }

  public static ExampleRepositoryImpl newInstance(ExampleDao exampleDao, ApiService apiService) {
    return new ExampleRepositoryImpl(exampleDao, apiService);
  }
}
