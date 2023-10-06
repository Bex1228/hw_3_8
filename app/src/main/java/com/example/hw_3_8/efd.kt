package com.example.hw_3_8

import android.media.Image
import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.loadImage(url : String){
    Glide.with(this).load(url).into(this)
}