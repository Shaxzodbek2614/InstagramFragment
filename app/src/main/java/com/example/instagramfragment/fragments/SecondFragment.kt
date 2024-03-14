package com.example.instagramfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagramfragment.R
import com.example.instagramfragment.adapters.EsdalikAdapter
import com.example.instagramfragment.adapters.PostAdapter
import com.example.instagramfragment.databinding.FragmentSecondBinding
import com.example.instagramfragment.utils.MyData


class SecondFragment : Fragment() {

    lateinit var binding:FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        MyData.addEsdalik()
        val esdalikAdapter = EsdalikAdapter(MyData.list2)
        binding.rv.adapter = esdalikAdapter

        MyData.addPost()
        val postAdapter = PostAdapter(MyData.listPost)
        binding.rvPost.adapter = postAdapter
        return binding.root
    }

}