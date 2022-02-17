package com.example.simplecalculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.IntegerRes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bienA = findViewById<EditText?>(R.id.ed_inputA)
        var bienB : EditText? = findViewById(R.id.ed_inputB)

//
//        val numA : Int = bienA.toString().toInt()
//        val numB : Int = bienB.toString().toInt()

//        val numA = Integer.parseInt(bienA.text.toString())

        val resultBtn : Button = findViewById(R.id.btn_result)

        val resultTextView : TextView = findViewById(R.id.tv_result)

        resultBtn.setOnClickListener {
            var numA = bienA?.text.toString()
            println("A: " + numA)
            var numB = bienB?.text.toString()

            if (numA == null || numB == ""){
                resultTextView.text = "Vui long nhap du gia tri"
            } else {
                resultTextView.text = (Integer.parseInt(numA!!) + Integer.parseInt(numB!!)).toString()
            }
        }
    }

//    fun calculate(a : Int, b : Int) : Int{
//        return a+b
//    }

}