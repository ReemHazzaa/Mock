package com.example.mock.app.di

import com.example.mock.data.remote.apiService.MockApiService
import com.example.mock.data.remote.networkLayer.client.MockClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiServicesModule {

    @Provides
    @Singleton
    fun provideApiService(mockClient: MockClient): MockApiService {
        return mockClient.build().create(MockApiService::class.java)
    }

}