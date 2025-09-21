package com.appwork.pokeapi_kotlin.reuseable


import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.appwork.pokeapi_kotlin.R

class FilterButtonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private val filterButton: ImageButtonView

    init {
        LayoutInflater.from(context).inflate(R.layout.view_filter_button, this, true)
        filterButton = findViewById(R.id.filter_button)
    }
}