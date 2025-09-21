package com.appwork.pokeapi_kotlin.reuseable

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.FrameLayout
import com.appwork.pokeapi_kotlin.R

class SearchBoxView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private val searchEditText: EditText
    private val clearButton: ImageButtonView

    init {
        LayoutInflater.from(context).inflate(R.layout.view_search_box, this, true)

        searchEditText = findViewById(R.id.search_text)
        clearButton = findViewById(R.id.clear_button)

        clearButton.setOnClickListener {
            searchEditText.setText("")
        }
    }
}