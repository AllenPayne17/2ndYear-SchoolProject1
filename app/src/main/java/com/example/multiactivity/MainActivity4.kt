package com.example.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {

    private lateinit var name : EditText
    private lateinit var id : EditText
    private lateinit var course : EditText
    private lateinit var year : EditText
    private lateinit var male : RadioButton
    private lateinit var female : RadioButton
    private lateinit var course1 : CheckBox
    private lateinit var course2 : CheckBox
    private lateinit var course3 : CheckBox
    private lateinit var course4 : CheckBox

    private lateinit var vname : TextView
    private lateinit var vid : TextView
    private lateinit var vcourse : TextView
    private lateinit var vYear : TextView
    private lateinit var vgender : TextView
    private  lateinit var vSubject : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        name = findViewById(R.id.etName)
        id = findViewById(R.id.etId)
        course = findViewById(R.id.etCourse)
        year = findViewById(R.id.etYear)
        male = findViewById(R.id.rbntMale)
        female = findViewById(R.id.rbntFemale)
        course1 = findViewById(R.id.cbCourse1)
        course2 = findViewById(R.id.cbCourse2)
        course3 = findViewById(R.id.cbCourse3)
        course4 = findViewById(R.id.cbCourse4)

        vname = findViewById(R.id.viewName)
        vid = findViewById(R.id.viewID)
        vcourse = findViewById(R.id.viewCourse)
        vYear = findViewById(R.id.viewYear)
        vgender = findViewById(R.id.viewGender)
        vSubject = findViewById(R.id.viewSubject)

    }
    fun clickHere (@Suppress("UNUSED_PARAMETER")view: View? ) {
        vname.text = name.text
        vid.text = id.text
        vcourse.text = course.text
        vYear.text = year.text

        if(male.isChecked){
            vgender.text = male.text
        }else{
            vgender.text = female.text
        }

        var courses = ""

        if(course1.isChecked){courses += " " + course1.text}
        if(course2.isChecked){courses += " " + course2.text}
        if(course3.isChecked){courses += " " + course3.text}
        if(course4.isChecked){courses += " " + course4.text}

        vSubject.text = courses
    }
}