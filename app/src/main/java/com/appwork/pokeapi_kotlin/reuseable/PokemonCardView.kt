package com.appwork.pokeapi_kotlin.reuseable

import android.content.Context
import androidx.core.content.ContextCompat
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.appwork.pokeapi_kotlin.R
import com.appwork.pokeapi_kotlin.utils.dpToPx

class PokemonCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private val tagTextView: TextView
    private val nameTextView: TextView
    private val bannerImageView: ImageView
    private var bottomContainer: LinearLayout? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.view_pokemon_card, this, true)
        tagTextView = findViewById(R.id.tag)
        bannerImageView = findViewById(R.id.banner)
        nameTextView = findViewById(R.id.name)
        bottomContainer = findViewById(R.id.bottom_container)

        setupView()
    }

    private fun setupView() {
        val radius = 7f.dpToPx(context) // dalam pixel, kalau mau dp -> convert
        val shape = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            setColor(ContextCompat.getColor(context, R.color.background))
            cornerRadii = floatArrayOf(
                radius, radius,   // Top left radius
                radius, radius,   // Top right radius
                0f, 0f,           // Bottom right radius
                0f, 0f            // Bottom left radius
            )
        }

        // set ke background view
        bottomContainer?.background = shape
    }
}