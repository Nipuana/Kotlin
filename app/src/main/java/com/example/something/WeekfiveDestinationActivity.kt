package com.example.something

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.something.adapter.FruitsAdapter
import com.example.something.adapter.Week5TaskAdapter
import com.example.something.databinding.ActivityDestinationBinding
import com.example.something.databinding.ActivityWeekfiveBinding
import com.example.something.databinding.ActivityWeekfiveDestinationBinding

class WeekfiveDestinationActivity : AppCompatActivity() {
    lateinit var binding: ActivityWeekfiveDestinationBinding


    val imgList = arrayListOf(R.drawable.a
        , R.drawable.b
        , R.drawable.c)
    val TitleList = arrayListOf("Elephant",
        "Dog",
        "Drawing")

    val DescList = arrayListOf("This is a elephant",
        "This is a dog",
        "This is a drawing")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWeekfiveDestinationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username : String = intent.getStringExtra("username").toString()
        val email : String = intent.getStringExtra("email").toString()
        val gender : String = intent.getStringExtra("gender").toString()
        val country : String = intent.getStringExtra("country").toString()
        val city : String = intent.getStringExtra("city").toString()


        binding.wShowName.text=username
        binding.wShowEmail.text=email
        binding.wshowGender.text=gender
        binding.wShowCountry.text=country
        binding.wShowCity.text=city










            val adapter = Week5TaskAdapter(this@WeekfiveDestinationActivity, imgList, TitleList, DescList)


            binding.wRecycler.adapter = adapter
            binding.wRecycler.layoutManager = GridLayoutManager(this, 1)











        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}