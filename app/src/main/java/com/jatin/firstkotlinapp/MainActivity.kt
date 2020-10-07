package com.jatin.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var btnToast: Button
    lateinit var btnChangeText: Button
    lateinit var txt: TextView
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast = findViewById(R.id.btnToast)
        btnChangeText = findViewById(R.id.btnChangeText)
        txt = findViewById(R.id.txt)
        imageView = findViewById(R.id.imageView)

        btnToast.setOnClickListener {
            Toast.makeText(this, "Hii", Toast.LENGTH_SHORT).show()
        }
        btnChangeText.setOnClickListener {
            txt.text = "Hey this is new text changed runtime.."
        }

    }

    fun exitNow(view: View) {
        var btn: Button = findViewById(R.id.btnChargeDischarge)
        if (btn.text == "Charge Now") {
            imageView.setImageResource(R.drawable.battery_full)
            btn.text = "Discharge Now"
        } else {
            imageView.setImageResource(R.drawable.battery_low)
            btn.text = "Charge Now"
        }
    }
}