package com.example.calculatearea

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var  Soundt:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var CkickIm=findViewById<ImageView>(R.id.imageView)
        var BtEnd=findViewById<Button>(R.id.button)
        var BtPlay=findViewById<Button>(R.id.button5)
        var Btstop=findViewById<Button>(R.id.button6)

        BtPlay.setOnClickListener {
            Soundt= MediaPlayer()
            var music=assets.openFd("theyoungwofe.mp3")
            Soundt.setDataSource(music.fileDescriptor,music.startOffset,music.length)
            Soundt.prepare()
            Soundt.start()
        }
        Btstop.setOnClickListener {
            Soundt.stop()
        }
        CkickIm.setOnClickListener {
            var activity2Intent = Intent(this,Activity2::class.java)
            startActivity(activity2Intent)
        }
        BtEnd.setOnClickListener {
            Soundt.stop()
            finish()
        }
    }
}