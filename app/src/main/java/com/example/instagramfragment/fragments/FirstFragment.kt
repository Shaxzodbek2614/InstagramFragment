package com.example.instagramfragment.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagramfragment.R
import com.example.instagramfragment.adapters.StoryAdapter
import com.example.instagramfragment.databinding.FragmentFirstBinding
import com.example.instagramfragment.utils.MyData


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        MyData.addStory()
        val storyAdapter = StoryAdapter(MyData.list)
        binding.rvStory.adapter = storyAdapter
        var a = true

        binding.swap.setOnRefreshListener {
            Handler().postDelayed(kotlinx.coroutines.Runnable {
                binding.swap.isRefreshing = false
                if (a){
                    binding.image.setImageResource(R.drawable.img_1)
                    a=false
                }else{
                    binding.image.setImageResource(R.drawable.moskva)
                    a=true
                }
            },3000)
        }
        return binding.root
    }

}