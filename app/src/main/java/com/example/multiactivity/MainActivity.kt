package com.example.multiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculatorActivity (@Suppress("UNUSED_PARAMETER")view: View?){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
    fun stringManipulationActivity (@Suppress("UNUSED_PARAMETER")view: View? ){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
    fun layoutDemoActivity (@Suppress("UNUSED_PARAMETER")view: View? ){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
    fun firebaseCrudActivity (@Suppress("UNUSED_PARAMETER")view: View? ){
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
    fun aboutMeActivity (@Suppress("UNUSED_PARAMETER")view: View? ){
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }
}