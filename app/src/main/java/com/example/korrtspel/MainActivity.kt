package com.example.korrtspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var greeting : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greeting = findViewById(R.id.greeting)

        val startButton = findViewById<Button>(R.id.start)
        startButton.setOnClickListener{
            startGame()
        }
    }

    private fun startGame(){
        val intent = Intent(this, HiLoCardGame::class.java )
        startActivity(intent)
    }
}