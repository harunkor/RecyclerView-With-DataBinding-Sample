package com.harunkor.remind.drink.myapplication

import android.widget.ImageView
import androidx.databinding.BindingAdapter

class DataBindingAdapter {

    companion object {
        @JvmStatic @BindingAdapter("imageResource")
        fun setImageResourse(imageView: ImageView,resource:Int)
        {
            imageView.setImageResource(resource)
        }
    }
}