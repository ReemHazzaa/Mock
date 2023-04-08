package com.example.mock.data.remote.apiService

import com.example.mock.domain.entity.MockApiResponse
import retrofit2.http.GET

interface MockApiService {
    @GET("products")
    suspend fun getProducts(): MockApiResponse
}