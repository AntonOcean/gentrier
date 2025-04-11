package com.example.gentrier.data.di;

import com.example.gentrier.data.local.AppDatabase;
import com.example.gentrier.data.local.dao.ExampleDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideExampleDaoFactory implements Factory<ExampleDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public DatabaseModule_ProvideExampleDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ExampleDao get() {
    return provideExampleDao(appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideExampleDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvideExampleDaoFactory(appDatabaseProvider);
  }

  public static ExampleDao provideExampleDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideExampleDao(appDatabase));
  }
}
