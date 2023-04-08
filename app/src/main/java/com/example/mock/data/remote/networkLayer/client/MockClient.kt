package com.example.mock.data.remote.networkLayer.client


import com.example.mock.BuildConfig
import retrofit2.Retrofit

class MockClient(retrofitBuilder: Retrofit.Builder) : NetworkClient(retrofitBuilder) {

    override val baseUrl = BuildConfig.MOCK_BASE_URL
}