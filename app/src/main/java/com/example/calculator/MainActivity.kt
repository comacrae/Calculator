package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var tvOutput: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvOutput = findViewById<TextView>(R.id.output)
        val btnZero: Button = findViewById<Button>(R.id.btnZero)
        val btnOne: Button = findViewById<Button>(R.id.btnOne)
        val btnTwo: Button = findViewById<Button>(R.id.btnTwo)
        val btnThree: Button = findViewById<Button>(R.id.btnThree)
        val btnFour: Button = findViewById<Button>(R.id.btnFour)
        val btnFive: Button = findViewById<Button>(R.id.btnFive)
        val btnSix: Button = findViewById<Button>(R.id.btnSix)
        val btnSeven: Button = findViewById<Button>(R.id.btnSeven)
        val btnEight:Button = findViewById<Button>(R.id.btnEight)
        val btnNine:Button = findViewById<Button>(R.id.btnNine)
        val btnDivide:Button = findViewById<Button>(R.id.btnDivide)
        val btnMultiply:Button = findViewById<Button>(R.id.btnMultiply)
        val btnAdd:Button = findViewById<Button>(R.id.btnAdd)
        val btnSubtract:Button = findViewById<Button>(R.id.btnSubtract)
        val btnClear:Button = findViewById<Button>(R.id.btnClear)
        btnZero.setOnClickListener(this)
        btnOne.setOnClickListener(this)
        btnTwo.setOnClickListener(this)
        btnThree.setOnClickListener(this)
        btnFour.setOnClickListener(this)
        btnFive.setOnClickListener(this)
        btnSix.setOnClickListener(this)
        btnSeven.setOnClickListener(this)
        btnEight.setOnClickListener(this)
        btnNine.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
        btnAdd.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnClear.setOnClickListener(this)
        btnSubtract.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        if(view?.id in arrayOf(R.id.btnAdd,R.id.btnDivide,R.id.btnMultiply,R.id.btnSubtract)){

        }else if(view?.id?.equals( R.id.btnClear)!!) {
           tvOutput?.text = ""
        }else{
            tvOutput?.append((view as Button).text)
        }
    }



}