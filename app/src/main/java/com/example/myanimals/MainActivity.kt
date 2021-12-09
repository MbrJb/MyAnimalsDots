package com.example.myanimals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myanimals.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.bear,R.drawable.bee,R.drawable.bull,R.drawable.cat,R.drawable.dog
        )

        val name = arrayOf(
            "Bear", "Bee", "Bull","Cat","Dog"
        )

        val description = arrayOf("A Bear is a wild animal.", "A Bee stings like no other.", "A Bull will charge,then attack.",
        "A Cat is a domestic animal.", "A Dog is man's best friend")

        userArrayList = ArrayList()

        for(i in name.indices){

            val user = User(name[i],description[i],imageId[i])
            userArrayList.add(user)
        }

        binding.listview.adapter =MyAdapter(this,userArrayList)
    }
}