package com.example.instagramfragment.utils

import com.example.instagramfragment.R
import com.example.instagramfragment.models.Story

object MyData {
    var list = ArrayList<Story>()
    fun addStory(){
        list.add(Story(R.drawable.fon,"Your story"))
        for (i in 1..3){
            list.add(Story(R.drawable.image1,"karennne"))
            list.add(Story(R.drawable.image2,"zackjohn"))
            list.add(Story(R.drawable.image3,"kieron_d"))
            list.add(Story(R.drawable.image4,"craig_low"))
        }
    }

    var list2 = ArrayList<Story>()
    fun addEsdalik(){
        for(i in 1..3){
            list2.add(Story(R.drawable.img1,"Friends"))
            list2.add(Story(R.drawable.img2,"Sport"))
            list2.add(Story(R.drawable.img3,"Design"))
        }
    }

    var listPost = ArrayList<Int>()
    fun addPost(){
        for (i in 1..10){
            listPost.add(R.drawable.img_1)
            listPost.add(R.drawable.img_2)
            listPost.add(R.drawable.img_3)
            listPost.add(R.drawable.img_4)
        }
    }
}