package com.example.something

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class InteractionActivity : AppCompatActivity() {

    lateinit var btnSnack: Button
    lateinit var btnAlert: Button
    lateinit var btnToast: Button
    lateinit var main : ConstraintLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interaction)

        main= findViewById(R.id.main)
        btnSnack=findViewById(R.id.Snack)
        btnToast=findViewById(R.id.toast)
        btnAlert=findViewById(R.id.Alert)


        btnToast.setOnClickListener{
            Toast.makeText(this@InteractionActivity,
                "Login success",Toast.LENGTH_LONG).show()
        }
        btnSnack.setOnClickListener{
           Snackbar.make(main,"Invalid Login",Snackbar.LENGTH_LONG).setAction("Close",{}).show()


        }
        btnAlert.setOnClickListener{
            
           var alertD= AlertDialog.Builder(this@InteractionActivity)
            alertD.setTitle("Confirmation")
                 .setMessage("Are you sure?")
                .setIcon(R.drawable.c)
                .setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->  })
                .setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->  })
            alertD.create().show()
            
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}