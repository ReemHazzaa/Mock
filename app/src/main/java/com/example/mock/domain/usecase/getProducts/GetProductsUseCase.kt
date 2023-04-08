package com.example.mock.domain.usecase.getProducts

import com.example.mock.domain.entity.Product
import com.example.mock.domain.repo.MockApiRepo
import com.example.mock.domain.usecase.BaseUseCase
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(private val mockApiRepo: MockApiRepo) :
    BaseUseCase<Any, ArrayList<Product>>() {

    override suspend fun execute(params: Any): ArrayList<Product> {
        return mockApiRepo.getProducts()
    }
}