package com.example.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var firstNum : EditText
    private lateinit var secondNum :  EditText
    private lateinit var textSum : TextView
    private lateinit var textSub : TextView
    private lateinit var textMulti : TextView
    private lateinit var textDivide : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        firstNum = findViewById(R.id.etNum1)
        secondNum = findViewById(R.id.etNum2)

        textSum = findViewById(R.id.tvSum)
        textSub = findViewById(R.id.tvSub)
        textMulti = findViewById(R.id.tvMulti)
        textDivide = findViewById(R.id.tvDivide)
    }
    fun clickHere (@Suppress("UNUSED_PARAMETER")view: View? ) {
        val sum = firstNum.text.toString().toInt() + secondNum.text.toString().toInt()
        textSum.text = "$sum"

        val sub = firstNum.text.toString().toInt() - secondNum.text.toString().toInt()
        textSub.text = "$sub"

        val multi = firstNum.text.toString().toInt() * secondNum.text.toString().toInt()
        textMulti.text = "$multi"

        val divide = firstNum.text.toString().toInt() / secondNum.text.toString().toInt()
        textDivide.text = "$divide"

    }
}