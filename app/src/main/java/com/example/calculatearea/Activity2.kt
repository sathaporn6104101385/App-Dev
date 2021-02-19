package com.example.calculatearea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        var readdd =findViewById<Button>(R.id.button2)
        var Nex = findViewById<Button>(R.id.button3)
        var loadTxt = findViewById<EditText>(R.id.editTextTextMultiLine)
        readdd.setOnClickListener {
            var file=resources.openRawResource(R.raw.basaaaa)
            var lines=file.bufferedReader(Charsets.UTF_8).readLines()
            var text=""
            for(line in lines){
                text=text+line+"\n"
            }
            loadTxt.setText(text)
        }

        Nex.setOnClickListener {
            var activity3Intent= Intent(this,Activity3::class.java)
            startActivity(activity3Intent)
        }
    }
}