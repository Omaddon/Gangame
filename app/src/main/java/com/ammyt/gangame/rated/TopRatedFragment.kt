package com.ammyt.gangame.rated

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.View
import com.ammyt.commons.BaseListFragment
import com.ammyt.commons.DataBindingRecyclerAdapter
import com.ammyt.gangame.BR
import com.ammyt.gangame.R
import com.ammyt.gangame.TopGame
import com.ammyt.gangame.data.GangameDataSource


/**
 * Created by ammyt on 23/10/17.
 */

class TopRatedFragment : BaseListFragment() {

    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<TopGame>(BR.topGame, R.layout.item_top_game)
    }

    override fun onResume() {
        super.onResume()

        showTopRated()
    }

    private fun showTopRated() {
        GangameDataSource
                .getTopRated()
                .subscribe({ list ->
                    replaceItems(list)
                }, { error ->
                    showError(error)
                })
    }

    private fun showError(error: Throwable) {
        error.printStackTrace()

        view?.let {
            Snackbar.make(view as View, R.string.error_request, Snackbar.LENGTH_LONG)
                    .setAction(R.string.label_retry, { _: View -> showTopRated() })
                    .show()
        }
    }

    private fun replaceItems(list: List<TopGame>) {
        with(listAdapter as DataBindingRecyclerAdapter<TopGame>) {
            items.clear()
            items.addAll(list)
            notifyDataSetChanged()
        }
    }

    /*
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
    */

}
