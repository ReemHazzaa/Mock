package com.example.mock.domain.repo

import com.example.mock.domain.entity.MockApiResponse

interface MockApiRepo {
    suspend fun getProducts(): MockApiResponse
}