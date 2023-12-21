package com.example.ez_adk_04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ez_adk_04.databinding.ActivitySecondBinding
import kotlin.random.Random

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val shw: TextView = findViewById(R.id.shw)
        val num2: TextView = findViewById(R.id.num2)
        val setzero: Button = findViewById(R.id.setzero)

        var rand2: Int = 0

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)

        shw.setText("Here is a random number \n between 0 and $nrand")
        rand2 = Random.nextInt(0, nrand)
        num2.setText(rand2.toString())

        setzero.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}