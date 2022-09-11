package com.example.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {

    private lateinit var name : EditText
    private lateinit var course : EditText
    private lateinit var section : EditText
    private lateinit var vName : TextView
    private lateinit var vCourse : TextView
    private lateinit var vSection : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        name = findViewById(R.id.etMyName)
        course = findViewById(R.id.etMyCourse)
        section = findViewById(R.id.etMySection)
        vName = findViewById(R.id.vtname)
        vCourse = findViewById(R.id.vtcourse)
        vSection = findViewById(R.id.vtsection)
    }
    fun clickHere (vew : View){
        vName.text = name.text
        vCourse.text = course.text
        vSection.text = section.text
    }
}