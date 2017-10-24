package com.ammyt.commons

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by ammyt on 24/10/17.
 */


@BindingAdapter("imageUrl")
fun loadImage(imageView: ImageView, url: String) {
    Glide.with(imageView)
            .load(url)
            .into(imageView)
}