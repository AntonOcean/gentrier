package com.example.gentrier.data.service;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class LocationTrackingService_MembersInjector implements MembersInjector<LocationTrackingService> {
  private final Provider<Class<?>> mainActivityClassProvider;

  public LocationTrackingService_MembersInjector(Provider<Class<?>> mainActivityClassProvider) {
    this.mainActivityClassProvider = mainActivityClassProvider;
  }

  public static MembersInjector<LocationTrackingService> create(
      Provider<Class<?>> mainActivityClassProvider) {
    return new LocationTrackingService_MembersInjector(mainActivityClassProvider);
  }

  @Override
  public void injectMembers(LocationTrackingService instance) {
    injectMainActivityClass(instance, mainActivityClassProvider.get());
  }

  @InjectedFieldSignature("com.example.gentrier.data.service.LocationTrackingService.mainActivityClass")
  public static void injectMainActivityClass(LocationTrackingService instance,
      Class<?> mainActivityClass) {
    instance.mainActivityClass = mainActivityClass;
  }
}
