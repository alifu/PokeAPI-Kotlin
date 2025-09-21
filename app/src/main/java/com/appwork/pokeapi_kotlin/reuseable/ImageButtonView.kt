package com.appwork.pokeapi_kotlin.reuseable

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.appwork.pokeapi_kotlin.R
import com.appwork.pokeapi_kotlin.databinding.ViewImageButtonBinding

class ImageButtonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private val binding: ViewImageButtonBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = ViewImageButtonBinding.inflate(inflater, this, true)

        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.ImageButtonView,
            0, 0
        ).apply {
            try {
                val img = getResourceId(R.styleable.ImageButtonView_buttonImage, -1)
                if (img != -1) binding.backgroundImage.setImageResource(img)

                val tintColor = getColor(R.styleable.ImageButtonView_buttonTint, Color.TRANSPARENT)
                if (tintColor != Color.TRANSPARENT) {
                    binding.backgroundImage.setColorFilter(tintColor, PorterDuff.Mode.SRC_IN)
                }
            } finally {
                recycle()
            }
        }

        isClickable = true
        isFocusable = true
    }

//    fun setOnImageButtonClickListener(listener: (() -> Unit)?) {
//        binding.innerButton.setOnClickListener {
//            listener?.invoke()
//        }
//        // atau kalau mau seluruh view yang klik:
//        // super.setOnClickListener { listener?.invoke() }
//    }

}
