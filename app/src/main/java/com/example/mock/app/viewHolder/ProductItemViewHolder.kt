package com.example.mock.app.viewHolder

import androidx.databinding.ViewDataBinding
import com.example.mock.app.utils.genericadapter.Listable
import com.example.mock.app.utils.genericadapter.listener.OnItemClickCallback
import com.example.mock.app.utils.genericadapter.viewholder.BaseViewHolder
import com.example.mock.domain.entity.Product

class ProductItemViewHolder(
    val binding: ViewDataBinding,
    onItemClickCallback: OnItemClickCallback
) :
    BaseViewHolder(binding, onItemClickCallback) {
    init {
        attachClickListener(binding.root)
    }

    override fun draw(listable: Listable) {
        super.draw(listable)
        val current = listable as Product
    }
}