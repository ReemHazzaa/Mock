package com.example.mock.app.di

import com.example.mock.data.remote.networkLayer.client.MockClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkClientsModule {

    @Provides
    @Singleton
    fun provideMockNetworkClient(retrofitBuilder: Retrofit.Builder): MockClient {
        return MockClient(retrofitBuilder)
    }

}