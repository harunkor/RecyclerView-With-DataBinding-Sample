package com.harunkor.remind.drink.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.harunkor.remind.drink.myapplication.databinding.ItemClothesBinding

class ClothesAdapter(
    val list: List<ClothesModel>,
    val onClickHandlerInterface: OnClickHandlerInterface
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val clothesBinding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), R.layout.item_clothes, parent, false
        )
        return ClothesViewHolder(clothesBinding, onClickHandlerInterface)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ClothesViewHolder).onBind(list.get(position), position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ClothesViewHolder(
        val clothesBinding: ViewDataBinding,
        val onClickHandlerInterface: OnClickHandlerInterface
    ) : RecyclerView.ViewHolder(clothesBinding.root) {

        fun onBind(clothesModel: ClothesModel, position: Int) {
            val binding = clothesBinding as ItemClothesBinding
            binding.setVariable(BR.itemclothes, clothesModel)
            binding.setVariable(BR.clickHandler, onClickHandlerInterface)
            binding.setVariable(BR.position, position)
        }

    }


}