package com.example.mock.app.ui.main

import android.os.Bundle
import android.view.View
import androidx.databinding.library.baseAdapters.BR
import androidx.fragment.app.viewModels
import com.example.mock.R
import com.example.mock.app.base.BaseFragment
import com.example.mock.app.extensions.updateStatusBarColor
import com.example.mock.app.utils.genericadapter.Listable
import com.example.mock.app.utils.genericadapter.adapter.GeneralListAdapter
import com.example.mock.app.utils.genericadapter.listener.OnItemClickCallback
import com.example.mock.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>() {
    override val layoutResId: Int = R.layout.fragment_main
    override val mViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel.getProducts()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().updateStatusBarColor(R.color.grey_E3E2E5, false)
        viewDataBinding.apply {
            setVariable(BR.viewModel, mViewModel)

            rvProducts.adapter =
                GeneralListAdapter(context = requireContext(), onItemClickCallback = object :
                    OnItemClickCallback {
                    override fun onItemClicked(view: View, listableItem: Listable, position: Int) {

                    }
                })
            swipeRefresh.setOnRefreshListener {
                swipeRefresh.isRefreshing = true
                mViewModel.getProducts()
                swipeRefresh.isRefreshing = false
            }

        }
    }


}