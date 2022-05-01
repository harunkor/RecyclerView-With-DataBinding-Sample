package com.harunkor.remind.drink.myapplication

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object DataBindingAdapter {

    //Binding adapterları extension olarak yazman daha kolay olurdu.
    /*companion object {
        @JvmStatic @BindingAdapter("imageResource")
        fun setImageResourse(imageView: ImageView, resource: Int) {
            imageView.setImageResource(resource)
        }
    }*/

    //Use  Extension Function
    @JvmStatic
    @BindingAdapter("imageResource")
    fun ImageView.setImageResourse(resource: Int) {
        setImageResource(resource)
    }
    //End Use  Extension Function


}