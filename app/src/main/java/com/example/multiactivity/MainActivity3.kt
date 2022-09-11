package com.example.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    private lateinit var enteredText : EditText

    private lateinit var txtCons : TextView
    private lateinit var txtUpperCase : TextView
    private lateinit var totalVowels : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        enteredText = findViewById(R.id.etString)

        txtCons = findViewById(R.id.tvCons)
        txtUpperCase = findViewById(R.id.tvUpperCase)
        totalVowels = findViewById(R.id.tvTotalVowels)

    }
    fun onClick (@Suppress("UNUSED_PARAMETER")view: View? ) {
        var newVowels = ""
        val cons = enteredText.text.toString()
        for (c in cons) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                newVowels += c
            } else if (c == ' '){
                newVowels += c
            } else if (c != 'a' || c != 'e' || c != 'i' || c != 'o' || c != 'u') {
                newVowels += "#"
            }
        }
        txtCons.text = newVowels

        val upCase = enteredText.text.toString()
        val result = upCase.uppercase()
        txtUpperCase.text = result

        var count = 0
        val vowels = enteredText.text.toString()
        for(v in vowels) if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
            count += 1
        }
        totalVowels.text = "$count"

    }

}