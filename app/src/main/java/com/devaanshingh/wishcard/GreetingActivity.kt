package com.devaanshingh.wishcard

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class GreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val name = intent.getStringExtra("name")
        wish_text.text="Hey $name ! Wishing you a very Happy Birthday and a Prosperous Year ahead !"

    }

    fun convert(view: View) {
    if(switch1.text == "M") {
        greet_view.setBackgroundColor(Color.YELLOW)
        switch1.text = "Y"
        wish_text.setTextColor(Color.MAGENTA)
    }
    else if (switch1.text=="Y") {

        greet_view.setBackgroundColor(Color.MAGENTA)
        switch1.text = "M"
        wish_text.setTextColor(Color.WHITE)
    }

    Toast.makeText(this, "Color Changed" , Toast.LENGTH_SHORT).show()
}
}