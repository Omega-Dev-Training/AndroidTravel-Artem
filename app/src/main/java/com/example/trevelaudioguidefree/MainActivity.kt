package com.example.trevelguidfree

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.trevelaudioguidefree.R

import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonAttractions = findViewById<MaterialButton>(R.id.buttonAttractions)

        buttonAttractions.setOnClickListener{
            Toast.makeText(this, "Second...", Toast.LENGTH_SHORT).show()
        }


        val buttonNeedToKnow = findViewById<MaterialButton>(R.id.buttonNeedToKnow)

        buttonNeedToKnow.setOnClickListener{
            Toast.makeText(this, "Second...", Toast.LENGTH_SHORT).show()
        }


        val buttonMore = findViewById<MaterialButton>(R.id.buttonMore)

        buttonMore.setOnClickListener{
            Toast.makeText(this, "Second...", Toast.LENGTH_SHORT).show()
        }
    }
}