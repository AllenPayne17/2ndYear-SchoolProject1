package com.example.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.multiactivity.databinding.ActivityMain5Binding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity5 : AppCompatActivity() {

    private lateinit var binding : ActivityMain5Binding
    private lateinit var database : DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main5)

        binding.btnsubmit.setOnClickListener{

            val fullName = binding.etFullName.text.toString()

            database = FirebaseDatabase.getInstance().getReference("User")
            val user = User(fullName)
            database.child(fullName).setValue(user).addOnSuccessListener {
                binding.etFullName.text.clear()

                Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener{
                Toast.makeText(this, "Failed Saved", Toast.LENGTH_SHORT).show()
            }
        }
    }
}