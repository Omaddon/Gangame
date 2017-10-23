package com.ammyt.commons

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.fragment_list.view.*

/**
 * Created by ammyt on 23/10/17.
 */
abstract class BaseListFragment : BaseFragment() {

    val listAdapter: RecyclerView.Adapter<*>
        get() = getAdapter()

    override fun getLayoutResId(): Int {
        return R.layout.fragment_list
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view?.list?.let {
            with(view.list) {
                adapter = listAdapter
                layoutManager = LinearLayoutManager(context)
            }
        }
    }

    abstract fun getAdapter(): RecyclerView.Adapter<*>

}