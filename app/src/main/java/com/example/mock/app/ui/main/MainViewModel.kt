package com.example.mock.app.ui.main

import androidx.lifecycle.viewModelScope
import com.example.mock.app.base.BaseViewModel
import com.example.mock.app.base.ObserveOnceLiveData
import com.example.mock.domain.entity.Product
import com.example.mock.domain.usecase.getProducts.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase
) :
    BaseViewModel() {

    val productsLiveData = ObserveOnceLiveData<ArrayList<Product>>()

    fun getProducts() {
        viewModelScope.launch(getExceptionHandler()) {
            showProgress()
            productsLiveData.value = getProductsUseCase.execute("")
            hideProgress()
        }
    }
}