package com.example.something

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Radio_activity : AppCompatActivity() {




    lateinit var radioA: RadioButton
    lateinit var radioB: RadioButton
    lateinit var radioC: RadioButton
    lateinit var imageVeiwRadio : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        radioA= findViewById(R.id.a_button)
        radioB= findViewById(R.id.b_button)
        radioC= findViewById(R.id.c_button)
        imageVeiwRadio= findViewById(R.id.displayImage1)


        radioA.setOnClickListener{
            imageVeiwRadio.setImageResource(R.drawable.a)
        }
        radioB.setOnClickListener{
            imageVeiwRadio.setImageResource(R.drawable.b)
        }
        radioC.setOnClickListener{
            imageVeiwRadio.setImageResource(R.drawable.c)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}