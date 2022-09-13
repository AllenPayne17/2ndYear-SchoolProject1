package com.example.multiactivity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity5 : AppCompatActivity() {


    private var db = Firebase.firestore
    private lateinit var name : EditText
    private lateinit var age : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        name = findViewById(R.id.etFullName)
        age = findViewById(R.id.etAge)

    }
    fun saveToDatabase (@Suppress("UNUSED_PARAMETER")view: View?){

        val user = hashMapOf(
            "name" to name.text.toString(),
            "age" to age.text.toString()
        )
        db.collection("user")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("debug","DocumentSnapshot added ID: ${documentReference.id}")
                Toast.makeText(this, "DocumentSnapshot added ID: ${documentReference.id}", Toast.LENGTH_LONG ).show()
            }
            .addOnFailureListener { e ->
                Log.d("debug", "error Adding Document", e)
                Toast.makeText(this, "error Adding Document", Toast.LENGTH_LONG ).show()
            }
    }
}