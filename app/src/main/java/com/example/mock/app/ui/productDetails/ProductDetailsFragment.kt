package com.example.mock.app.ui.productDetails

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.mock.R
import com.example.mock.app.base.BaseFragment
import com.example.mock.app.base.BaseViewModel
import com.example.mock.app.extensions.updateStatusBarColor
import com.example.mock.app.utils.bindingadapters.ImageBindingAdapter.loadImageWithGlide
import com.example.mock.databinding.FragmentProductDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductDetailsFragment : BaseFragment<ProductDetailsViewModel, FragmentProductDetailsBinding>() {

    override val layoutResId: Int = R.layout.fragment_product_details
    override val mViewModel: ProductDetailsViewModel by viewModels()

    private val args: ProductDetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().updateStatusBarColor(R.color.grey_E3E2E5, false)
        val product = args.product
        viewDataBinding.apply {
            ivImage.loadImageWithGlide(product.image)
            tvTitle.text = product.title
            tvDescription.text = product.description
            tvPrice.text = product.price.toString()
            tvRating.text = product.rating.rate.toString()
        }
    }

}
