package com.example.instagramfragment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramfragment.databinding.ItemEstalikBinding
import com.example.instagramfragment.models.Story

class EsdalikAdapter(var list:ArrayList<Story>): RecyclerView.Adapter<EsdalikAdapter.Vh>() {
    inner class Vh(var estalikBinding:ItemEstalikBinding): RecyclerView.ViewHolder(estalikBinding.root){
        fun onBind(story: Story){
            estalikBinding.imgEsdalik.setImageResource(story.image)
            estalikBinding.name.text = story.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemEstalikBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}