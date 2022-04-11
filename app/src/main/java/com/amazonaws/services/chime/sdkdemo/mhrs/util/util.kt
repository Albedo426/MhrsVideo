package com.mobilist.mhrs.util

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.amazonaws.services.chime.sdkdemo.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.downloadFromUrl(url:String?, circularProgressDrawable: CircularProgressDrawable){
    val optionos = RequestOptions()
        .placeholder(circularProgressDrawable)
        //.placeholder(placeHolderProgressBar(context)) test et
        .error(R.mipmap.ic_launcher)//defauld resim
    Glide.with(context)
        .setDefaultRequestOptions(optionos)
        .load(url)
        .into(this)

}
fun placeHolderProgressBar(context: Context):CircularProgressDrawable{
    return CircularProgressDrawable(context).apply {
        strokeWidth=8f
        centerRadius=40f
    }
}

@BindingAdapter("android:load_Image")
fun setImageUri(view: ImageView,boolean: Boolean) {
    if (boolean) {
        view.setImageResource(R.drawable.mic)
    } else {
        view.setImageResource(R.drawable.mic_mute)
    }
}
//xmlde çalışması için
@BindingAdapter("android:downloadUrl")
fun dowloandImage(imageView:ImageView,url:String?){
    imageView.downloadFromUrl(url, placeHolderProgressBar(imageView.context))
}