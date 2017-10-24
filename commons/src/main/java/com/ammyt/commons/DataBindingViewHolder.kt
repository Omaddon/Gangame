package com.ammyt.commons

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by ammyt on 24/10/17.
 */
class DataBindingViewHolder<MODEL>(val itemVariableId: Int, val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bindItem(item: MODEL) {
        binding.setVariable(itemVariableId, item)
        binding.executePendingBindings()
    }
}