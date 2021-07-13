package com.devaanshingh.wishcard

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.CreateCardButton)
    }

    fun clicked(view: View) {
        val name = name_input.editableText.toString()
        Toast.makeText(this, "Name is $name" , Toast.LENGTH_SHORT).show()
        val intent = Intent(this, GreetingActivity::class.java )
        intent.putExtra("name", name)
        startActivity(intent)
    }

    @SuppressLint("ResourceAsColor")
    fun change(view: View) {
        if(switch_color.text == "G" ||switch_color.text == "P") {
            main_view.setBackgroundColor(Color.YELLOW)
            switch_color.text = "Y"
            CreateCardButton.setTextColor(Color.YELLOW)
        }
        else if (switch_color.text=="Y") {

                main_view.setBackgroundColor(R.color.background)
            switch_color.text = "P"
                CreateCardButton.setTextColor(R.color.background)
        }

    Toast.makeText(this, "Color Changed" , Toast.LENGTH_SHORT).show()
    }
}