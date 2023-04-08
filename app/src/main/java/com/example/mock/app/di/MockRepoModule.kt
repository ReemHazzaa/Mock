package com.example.mock.app.di


import com.example.mock.data.repo.MockRepoImpl
import com.example.mock.domain.repo.MockApiRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MockRepoModule {
    @Binds
    abstract fun provideMoviezRepoModule(mockRepoImpl: MockRepoImpl): MockApiRepo
}