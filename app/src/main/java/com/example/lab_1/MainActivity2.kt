package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var closeBtn = findViewById<Button>(android.R.id.button2);
        closeBtn.setOnClickListener {
            finish()

            //first commit
        };
    }
}