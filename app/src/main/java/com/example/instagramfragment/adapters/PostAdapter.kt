package com.example.instagramfragment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramfragment.databinding.ItemEstalikBinding
import com.example.instagramfragment.databinding.ItemPostBinding
import com.example.instagramfragment.models.Story

class PostAdapter(var list:ArrayList<Int>): RecyclerView.Adapter<PostAdapter.Vh>() {
    inner class Vh(var postBinding: ItemPostBinding): RecyclerView.ViewHolder(postBinding.root){
        fun onBind(image:Int){
            postBinding.image.setImageResource(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}