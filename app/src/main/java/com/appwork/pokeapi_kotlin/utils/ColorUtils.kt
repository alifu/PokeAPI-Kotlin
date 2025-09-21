package com.appwork.pokeapi_kotlin.utils

import android.content.Context
import androidx.core.content.ContextCompat
import com.appwork.pokeapi_kotlin.R

enum class ColorType {
    Bug,
    Dark,
    Dragon,
    Electric,
    Fairy,
    Fighting,
    Fire,
    Flying,
    Ghost,
    Grass,
    Ground,
    Ice,
    Poison,
    Psychic,
    Rock,
    Steel,
    Water,
    None;

    fun toColorRes(): Int {
        return when (this) {
            Bug -> R.color.bug
            Dark -> R.color.dark
            Dragon -> R.color.dragon
            Electric -> R.color.electric
            Fairy -> R.color.fairy
            Fighting -> R.color.fighting
            Fire -> R.color.fire
            Flying -> R.color.flying
            Ghost -> R.color.ghost
            Grass -> R.color.grass
            Ground -> R.color.ground
            Ice -> R.color.ice
            Poison -> R.color.poison
            Psychic -> R.color.psychic
            Rock -> R.color.rock
            Steel -> R.color.steel
            Water -> R.color.water
            None -> R.color.wireframe
        }
    }

    fun toColor(context: Context): Int {
        return ContextCompat.getColor(context, toColorRes())
    }
}

fun colorStringToType(context: Context, colorString: String?): Int {
    if (colorString == null) return ColorType.None.toColor(context)
    return try {
        val type = ColorType.valueOf(
            colorString.lowercase().replaceFirstChar { it.uppercase() }
        )
        type.toColor(context)
    } catch (e: IllegalArgumentException) {
        ColorType.None.toColor(context)
    }
}