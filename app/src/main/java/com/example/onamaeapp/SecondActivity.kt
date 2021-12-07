package com.example.onamaeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName :TextView = findViewById(R.id.tvName)
        val btnBack: Button = findViewById(R.id.btnBack)

        //値を取り出す(受け取る)
        //val text = intent.getStringExtra("KEY")
        val myName = intent.getStringExtra("MY_NAME")
        tvName.text = myName + "さん"

        btnBack.setOnClickListener {
            finish()
        }
    }
}