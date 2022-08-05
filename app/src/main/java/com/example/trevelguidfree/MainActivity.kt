package com.example.trevelguidfree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonAttractions: Button = findViewById(R.id.button)

        buttonAttractions.setOnClickListener {
            val text = Toast.makeText(this, "Seconds... We open 'Attractions'", Toast.LENGTH_SHORT)
            text.show()
        }


        val buttonNeedToKnow: Button = findViewById(R.id.button1)

        buttonNeedToKnow.setOnClickListener {
            val text = Toast.makeText(this, "Seconds... We open 'Need To Know'", Toast.LENGTH_SHORT)
            text.show()
        }


        val buttonMore: Button = findViewById(R.id.button2)

        buttonMore.setOnClickListener {
            val text = Toast.makeText(this, "Seconds... We open 'More'", Toast.LENGTH_SHORT)
            text.show()
        }


        val buttonExit: Button = findViewById(R.id.button3)

        buttonExit.setOnClickListener {
            finishAffinity()
        }
    }
}