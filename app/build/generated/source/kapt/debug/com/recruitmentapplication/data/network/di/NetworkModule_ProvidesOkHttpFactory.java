// Generated by Dagger (https://dagger.dev).
package com.recruitmentapplication.data.network.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class NetworkModule_ProvidesOkHttpFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public NetworkModule_ProvidesOkHttpFactory(NetworkModule module,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.module = module;
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttp(module, httpLoggingInterceptorProvider.get());
  }

  public static NetworkModule_ProvidesOkHttpFactory create(NetworkModule module,
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new NetworkModule_ProvidesOkHttpFactory(module, httpLoggingInterceptorProvider);
  }

  public static OkHttpClient providesOkHttp(NetworkModule instance,
      HttpLoggingInterceptor httpLoggingInterceptor) {
    return Preconditions.checkNotNullFromProvides(instance.providesOkHttp(httpLoggingInterceptor));
  }
}