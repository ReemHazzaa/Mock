package com.example.mock.app.utils.bindingadapters

import android.widget.RatingBar
import androidx.databinding.BindingAdapter

object RatingBarBindingAdapter {

    @JvmStatic
    @BindingAdapter("rate")
    fun RatingBar.rate(value: String?) {
        rating = value?.toFloat() ?: 0f
    }
}