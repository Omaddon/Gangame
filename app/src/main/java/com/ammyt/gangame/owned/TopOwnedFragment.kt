package com.ammyt.gangame.owned

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.ammyt.commons.BaseListFragment
import com.ammyt.commons.DataBindingRecyclerAdapter
import com.ammyt.gangame.BR
import com.ammyt.gangame.Deal
import com.ammyt.gangame.R
import com.ammyt.gangame.TopGame


/**
 * Created by ammyt on 23/10/17.
 */

class TopOwnedFragment : BaseListFragment() {

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<TopGame>(BR.topGame, R.layout.item_top_game)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (listAdapter as DataBindingRecyclerAdapter<TopGame>).items
                .addAll(getDummyTopGame())
        listAdapter.notifyDataSetChanged()
    }

    fun getDummyTopGame(): ArrayList<TopGame> {
        return arrayListOf(TopGame(
                "Counter Strike",
                13407338,
                80,
                "Valve",
                0.99F,
                1,
                "http://cdn.akami.steamstatic.com/steam/apps/10/capsule_184x69.jpg"
        ))
    }
}
