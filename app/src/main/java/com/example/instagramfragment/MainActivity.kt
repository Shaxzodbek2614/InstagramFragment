package com.example.instagramfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramfragment.databinding.ActivityMainBinding
import com.example.instagramfragment.fragments.FirstFragment
import com.example.instagramfragment.fragments.SecondFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container,firstFragment)
            .commit()
        binding.home.setOnClickListener {
            binding.home.setImageResource(R.drawable.ic_home)
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.container, firstFragment)
                    .commit()
        }

        binding.profile.setOnClickListener {
            binding.home.setImageResource(R.drawable.home)
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container,secondFragment)
                .addToBackStack(null)
                .commit()


        }

    }
}