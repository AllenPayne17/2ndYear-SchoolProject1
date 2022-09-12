package com.example.multiactivity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class MainActivity5 : AppCompatActivity() {

    private val db = Firebase.firestore
    private lateinit var input: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        input = findViewById(R.id.etFullName)
        button = findViewById(R.id.btnsubmit)

        button.setOnClickListener{
            val post = hashMapOf(
                "name" to input.text.toString(),
            )
            db.collection("post")
                .add(post)
                .addOnSuccessListener { documentReference ->
                    Log.d("Debug", "DocumentSnapshot added with ID: ${documentReference.id}")
                    Toast.makeText(this, "DocumentSnapshot added with ID: ${documentReference.id}", Toast.LENGTH_LONG).show()
                }
                .addOnFailureListener{
                    Log.w("debug", "Error adding Document")
                    Toast.makeText(this, "Error adding Document", Toast.LENGTH_SHORT).show()
                }
        }
    }
}