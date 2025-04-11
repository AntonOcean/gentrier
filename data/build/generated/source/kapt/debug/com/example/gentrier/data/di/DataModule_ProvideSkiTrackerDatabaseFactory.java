package com.example.gentrier.data.di;

import android.content.Context;
import com.example.gentrier.data.local.SkiTrackerDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class DataModule_ProvideSkiTrackerDatabaseFactory implements Factory<SkiTrackerDatabase> {
  private final Provider<Context> contextProvider;

  public DataModule_ProvideSkiTrackerDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SkiTrackerDatabase get() {
    return provideSkiTrackerDatabase(contextProvider.get());
  }

  public static DataModule_ProvideSkiTrackerDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new DataModule_ProvideSkiTrackerDatabaseFactory(contextProvider);
  }

  public static SkiTrackerDatabase provideSkiTrackerDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideSkiTrackerDatabase(context));
  }
}
