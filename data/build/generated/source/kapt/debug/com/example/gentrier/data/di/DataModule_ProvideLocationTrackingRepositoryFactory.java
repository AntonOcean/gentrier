package com.example.gentrier.data.di;

import android.content.Context;
import com.example.gentrier.domain.repository.LocationTrackingRepository;
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
public final class DataModule_ProvideLocationTrackingRepositoryFactory implements Factory<LocationTrackingRepository> {
  private final Provider<Context> contextProvider;

  public DataModule_ProvideLocationTrackingRepositoryFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public LocationTrackingRepository get() {
    return provideLocationTrackingRepository(contextProvider.get());
  }

  public static DataModule_ProvideLocationTrackingRepositoryFactory create(
      Provider<Context> contextProvider) {
    return new DataModule_ProvideLocationTrackingRepositoryFactory(contextProvider);
  }

  public static LocationTrackingRepository provideLocationTrackingRepository(Context context) {
    return Preconditions.checkNotNullFromProvides(DataModule.INSTANCE.provideLocationTrackingRepository(context));
  }
}
