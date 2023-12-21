package com.example.ez_adk_04


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toa: Button = findViewById(R.id.toa)
        val count: Button = findViewById(R.id.count)
        val rand: Button = findViewById(R.id.rand)
        val txt: TextView = findViewById(R.id.txt)

        var numrand: Int = 0

        toa.setOnClickListener {
            val toast = Toast.makeText(this,"This program is count and random number",Toast.LENGTH_LONG)
            toast.show()
        }
        count.setOnClickListener {
            numrand = txt.text.toString().toInt()
            numrand++
            txt.setText(numrand.toString())
        }
        rand.setOnClickListener {
            val intent = Intent(this,Second::class.java)
            intent.putExtra("jumeng",numrand)
            startActivity(intent)
        }

    }
}