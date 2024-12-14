package com.example.something

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.something.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity() {

//    lateinit var button: Button

    lateinit var binding: ActivityButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.uName
//        binding.Pssword
//        button
          binding.conn.setOnClickListener {
                val username : String = binding.uName.text.toString()
                val password : String = binding.Pssword.text.toString()



              if (username.isEmpty()){
                  binding.uName.error= "Username can not be empty"
              }
              else if (password.isEmpty()){
                  binding.Pssword.error= "Password can not be empty"
              }
              else{
                  var intent = Intent( this@ButtonActivity, DestinationActivity::class.java)

                  intent.putExtra("username",username)
                  intent.putExtra("password",password)



                  startActivity(intent)
//              finish()
              }

              }




//        button=findViewById(R.id.conn)
//
//        button.setOnClickListener {
//            val intent =Intent(
//                this@ButtonActivity,RecycleVeiw::class.java)
//            startActivity(intent)
//            finish()
//        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}