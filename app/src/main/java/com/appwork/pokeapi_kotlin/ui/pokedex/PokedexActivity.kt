package com.appwork.pokeapi_kotlin.ui.pokedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appwork.pokeapi_kotlin.databinding.ActivityPokedexBinding

class PokedexActivity: AppCompatActivity() {

    private lateinit var binding: ActivityPokedexBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokedexBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}