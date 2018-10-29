package com.gmail.kishkevich.superArh.presentation.utils.databinder

import android.databinding.BindingAdapter
import android.databinding.ObservableField
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.gmail.kishkevich.superArh.presentation.utils.picasso.CircularTransformation
import com.squareup.picasso.Picasso

@BindingAdapter("visibility")
fun View.visibility(visibility: Boolean) {
    this.visibility = if (visibility) View.VISIBLE else View.INVISIBLE
}

@BindingAdapter("android:src")
fun loadImage(imageView: ImageView, url: String) {
    Picasso.get()
            .load(url)
            .transform(CircularTransformation())
            .into(imageView)
}
@BindingAdapter("text")
fun TextView.view(text : Int){
    this.text = text.toString()
}