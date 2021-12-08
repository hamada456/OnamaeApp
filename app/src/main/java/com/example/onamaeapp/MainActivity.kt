package com.example.onamaeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et:EditText = findViewById(R.id.et)
        val btnStart: Button = findViewById(R.id.btnStart)

        btnStart.setOnClickListener {
            //etが空かどうか？、toStrで文字列型にする
            if(et.text.toString() == ("")){
                //トースト
                Toast.makeText(this,"文字を入力して下さい",Toast.LENGTH_LONG).show()
                //アラート
                AlertDialog.Builder(this)
                    .setTitle("エラー")
                    .setMessage("文字を入力してください")
                    .setPositiveButton("OK",null)
                    .show()
            }else{
                //val intent = Intent(this,遷移先::class.java)
                val intent = Intent(this,SecondActivity::class.java)

                //値を渡す val et:EditText「変数名」 = "A"
                //intent.putExtra("KEY",変数名)
                intent.putExtra("MY_NAME",et.text.toString())

                startActivity(intent)
            }

        }
    }
}
//git push