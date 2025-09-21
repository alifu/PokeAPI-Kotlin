package com.appwork.pokeapi_kotlin.utils

import android.content.Context

fun Float.dpToPx(context: Context): Float {
    return this * context.resources.displayMetrics.density
}

class Helper {

}