package com.example.gentrier.data.repository;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class LocationTrackingRepositoryImpl_Factory implements Factory<LocationTrackingRepositoryImpl> {
  private final Provider<Context> contextProvider;

  public LocationTrackingRepositoryImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public LocationTrackingRepositoryImpl get() {
    return newInstance(contextProvider.get());
  }

  public static LocationTrackingRepositoryImpl_Factory create(Provider<Context> contextProvider) {
    return new LocationTrackingRepositoryImpl_Factory(contextProvider);
  }

  public static LocationTrackingRepositoryImpl newInstance(Context context) {
    return new LocationTrackingRepositoryImpl(context);
  }
}
