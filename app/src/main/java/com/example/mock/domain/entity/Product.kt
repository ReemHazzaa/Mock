package com.example.mock.domain.entity

import com.example.mock.BR
import com.example.mock.R
import com.example.mock.app.utils.genericadapter.HolderClass
import com.example.mock.app.utils.genericadapter.Listable
import com.example.mock.app.viewHolder.ProductItemViewHolder

data class Product(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val rating: Rating,
    val title: String
) : Listable {
    val priceString: String get() = price.toString()
    override val listItemType: HolderClass
        get() =
            HolderClass(ProductItemViewHolder::class.java, R.layout.item_product)
    override val variableId: Int get() = BR.product
}