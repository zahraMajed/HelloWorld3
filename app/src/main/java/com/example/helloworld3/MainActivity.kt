package com.example.helloworld3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var signUpBut:Button
    lateinit var signInBut:Button
    var newColor: String ="#CEEBEF"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpBut= findViewById(R.id.butsignup)
        signInBut= findViewById(R.id.butSignin)

        signUpBut.setOnClickListener {
            changeButColor()
        }
        signInBut.setOnClickListener {
            signInBut.setTextColor(Color.BLACK)
        }
    }

    fun changeButColor(){
        signUpBut.setTextColor(Color.BLACK)
        signUpBut.setBackgroundColor(Color.GRAY)
    }
}
