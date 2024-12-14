package com.example.something

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.something.databinding.ActivityButtonBinding
import com.example.something.databinding.ActivityWeekfiveBinding

class WeekfiveActivity : AppCompatActivity() {
    lateinit var binding: ActivityWeekfiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityWeekfiveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Wsubmit.setOnClickListener {
            val username : String = binding.wName.text.toString()
            val email : String = binding.wemail.text.toString()
            val password : String = binding.wpassword.text.toString()






            if (username.isEmpty()){
                binding.wName.error= "Username can not be empty"
            }
            else if (email.isEmpty()){
                binding.wemail.error= "email can not be empty"
            }else if (password.isEmpty()){
                binding.wpassword.error= "Password can not be empty"
            }
            
            else{
                binding.Wsubmit.setOnClickListener {
                    if (binding.wCheck.isChecked) {
                        // Collect input and navigate to the next activity
                        val intent = Intent(this@WeekfiveActivity, WeekfiveDestinationActivity::class.java).apply {
                            putExtra("username", binding.wName.text.toString())
                            putExtra("email", binding.wemail.text.toString())
                            putExtra("gender", if (binding.wMale.isChecked) "Male" else "Female")
                            putExtra("country", binding.wspin.selectedItem.toString())
                            putExtra("city", binding.wAutoComplete.text.toString())
                        }
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Please agree to terms and conditions", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        }




        val countries = arrayOf("USA", "Canada", "UK", "Australia","Nepal")
        val countryAdapter = ArrayAdapter(this@WeekfiveActivity, android.R.layout.simple_spinner_item, countries)
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.wspin.adapter = countryAdapter


        val cities = arrayOf("New York", "Toronto", "London", "Sydney","Kathmandu")
        val cityAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cities)
        binding.wAutoComplete.setAdapter(cityAdapter)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}