package com.example.calculatearea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        var inputT=findViewById<EditText>(R.id.editTextNumberDecimal)
        var Btcal=findViewById<Button>(R.id.button4)
        var SquareMeters=findViewById<RadioButton>(R.id.radioButton)
        var SquareWa = findViewById<RadioButton>(R.id.radioButton2)
        var rai=findViewById<RadioButton>(R.id.radioButton3)
        var Ngan=findViewById<RadioButton>(R.id.radioButton4)
        var output1=findViewById<TextView>(R.id.textView4)
        var output2=findViewById<TextView>(R.id.textView5)
        var output3=findViewById<TextView>(R.id.textView6)
        var output4=findViewById<TextView>(R.id.textView7)

        Btcal.setOnClickListener {
        try{
            if(SquareMeters.isChecked){
                output1.text="${inputT.text.toString().toDouble()*1.0}  "  +  resources.getString(R.string.Msp)
                output2.text="${inputT.text.toString().toDouble()*0.25}  "  +  resources.getString(R.string.Wsp)
                output3.text="${inputT.text.toString().toDouble()*0.000625}  "  +  resources.getString(R.string.R)
                output4.text="${inputT.text.toString().toDouble()*0.0025}  "  +  resources.getString(R.string.Ng)
                Log.v("answer",output1.text.toString())
                Log.v("answer2",output2.text.toString())
                Log.v("answer3",output3.text.toString())
                Log.v("answer4",output4.text.toString())
            }else if(SquareWa.isChecked){
                output1.text="${inputT.text.toString().toDouble()*4.0}  "  +  resources.getString(R.string.Msp)
                output2.text="${inputT.text.toString().toDouble()*1.0}  "  +  resources.getString(R.string.Wsp)
                output3.text="${inputT.text.toString().toDouble()*0.0025}  "  +  resources.getString(R.string.R)
                output4.text="${inputT.text.toString().toDouble()*0.01}  "  +  resources.getString(R.string.Ng)
                Log.v("answer",output1.text.toString())
                Log.v("answer2",output2.text.toString())
                Log.v("answer3",output3.text.toString())
                Log.v("answer4",output4.text.toString())
            }else if(rai.isChecked){
                output1.text="${inputT.text.toString().toDouble()/0.000625}  "  +  resources.getString(R.string.Msp)
                output2.text="${inputT.text.toString().toDouble()*400}  "  +  resources.getString(R.string.Wsp)
                output3.text="${inputT.text.toString().toDouble()*1.0}  "  +  resources.getString(R.string.R)
                output4.text="${inputT.text.toString().toDouble()*4.0}  "  +  resources.getString(R.string.Ng)
                Log.v("answer",output1.text.toString())
                Log.v("answer2",output2.text.toString())
                Log.v("answer3",output3.text.toString())
                Log.v("answer4",output4.text.toString())
            }else if (Ngan.isChecked) {
                output1.text="${inputT.text.toString().toDouble()*400}  "  +  resources.getString(R.string.Msp)
                output2.text="${inputT.text.toString().toDouble()*100}  "  +  resources.getString(R.string.Wsp)
                output3.text="${inputT.text.toString().toDouble()*0.25}  "  +  resources.getString(R.string.R)
                output4.text="${inputT.text.toString().toDouble()*1.0}  "  +  resources.getString(R.string.Ng)
                Log.v("answer",output1.text.toString())
                Log.v("answer2",output2.text.toString())
                Log.v("answer3",output3.text.toString())
                Log.v("answer4",output4.text.toString())
            }else{
                output1.text=resources.getString(R.string.Younc) //you not check
                output2.text="0.0"
                output3.text="0.0"
                output4.text="0.0"
                Log.v("answer",output1.text.toString())
                Log.v("answer2",output2.text.toString())
                Log.v("answer3",output3.text.toString())
                Log.v("answer4",output4.text.toString())
            }
            }catch (e: NumberFormatException){
                output1.text=resources.getString(R.string.Youni)
            output2.text="0.0"
            output3.text="0.0"
            output4.text="0.0"
            Log.v("answer",output1.text.toString())
            Log.v("answer2",output2.text.toString())
            Log.v("answer3",output3.text.toString())
            Log.v("answer4",output4.text.toString())

        }            }
        }
    }
