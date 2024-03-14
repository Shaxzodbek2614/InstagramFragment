package com.example.instagramfragment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramfragment.databinding.StoryItemBinding
import com.example.instagramfragment.models.Story

private const val TAG = "MovieAdapter"
class StoryAdapter(var list:ArrayList<Story>): RecyclerView.Adapter<StoryAdapter.Vh>() {
    inner class Vh(var storyItemBinding: StoryItemBinding):RecyclerView.ViewHolder(storyItemBinding.root){
        fun onBind(story: Story){
            storyItemBinding.img.setImageResource(story.image)
            storyItemBinding.name.text = story.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(StoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}