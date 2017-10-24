package com.ammyt.gangame.deals

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.ammyt.commons.BaseListFragment
import com.ammyt.commons.DataBindingRecyclerAdapter
import com.ammyt.gangame.BR
import com.ammyt.gangame.Deal
import com.ammyt.gangame.R


/**
 * Created by ammyt on 23/10/17.
 */

class DealsFragment : BaseListFragment() {

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<Deal>(BR.deal, R.layout.item_deal)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (listAdapter as DataBindingRecyclerAdapter<Deal>).items
                .addAll(getDummyDeals())
        listAdapter.notifyDataSetChanged()
    }

    fun getDummyDeals(): ArrayList<Deal> {
        return arrayListOf(Deal(
                "Counter Strike",
                0.99F,
                9.99F,
                80,
                80,
                "http://cdn.akami.steamstatic.com/steam/apps/10/capsule_184x69.jpg"
        ))
    }
}
