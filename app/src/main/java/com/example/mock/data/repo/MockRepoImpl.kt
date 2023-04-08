package com.example.mock.data.repo

import com.example.mock.data.remote.apiService.MockApiService
import com.example.mock.domain.entity.MockApiResponse
import com.example.mock.domain.repo.MockApiRepo
import javax.inject.Inject

class MockRepoImpl @Inject constructor(
    private val mockApiService: MockApiService
) :
    MockApiRepo {
    override suspend fun getProducts(): MockApiResponse = mockApiService.getProducts()
}

