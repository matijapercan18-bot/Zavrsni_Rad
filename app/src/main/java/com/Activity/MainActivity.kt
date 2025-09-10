package com.Activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.ViewModel.MainViewModel
import com.example.coffee_shop.databinding.ActivityMainBinding
import com.example.coffee_shop.databinding.ActivityMainBinding.*
import com.example.coffee_shop.databinding.ActivitySplashBinding
import kotlin.collections.get

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel= MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBanner()
    }

    private fun initBanner() {
        binding.progressBarBanner.visibility= View.VISIBLE
        viewModel.loadBanner().observeForever {
            Glide.with(this@MainActivity)
                .load(it[0].url)
                .into(binding.banner)
            binding.progressBarBanner.visibility= View.GONE
        }
        viewModel.loadBanner()
    }
}