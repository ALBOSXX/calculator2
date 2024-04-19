package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R
import com.example.calculator.databinding.ActivityMainBinding


     class MainActivity : AppCompatActivity() {



         private lateinit var binding: ActivityMainBinding

         var  firstNumber: Int? = null
         var operators: Operators? = null
         var secondNumber: Int? = null


         override fun onCreate(savedInstanceState: Bundle?) {
             super.onCreate(savedInstanceState)
             binding = ActivityMainBinding.inflate(layoutInflater)
             val view6 = binding.root
             setContentView(view6)


             val input = binding.myText
             val number1 = binding.button1
             val number2 = binding.button2
             val number3 = binding.button3
             val number4 = binding.button4
             val number5 = binding.button5
             val number6 = binding.button6
             val number7 = binding.button7
             val number8 = binding.button8
             val number9 = binding.button9
             val number0 = binding.button0


             binding.button1.setOnClickListener {
                 input.text = input.text.toString() + number1.text.toString()
             }
             binding.button2.setOnClickListener {
                 input.text = input.text.toString() + number2.text.toString()
             }
             binding.button3.setOnClickListener {
                 input.text = input.text.toString() + number3.text.toString()
             }
             binding.button4.setOnClickListener {
                 input.text = input.text.toString() + number4.text.toString()
             }
             binding.button5.setOnClickListener {
                 input.text = input.text.toString() + number5.text.toString()
             }

             binding.button6.setOnClickListener {
                 input.text = input.text.toString() + number6.text.toString()
             }
             binding.button7.setOnClickListener {
                 input.text = input.text.toString() + number7.text.toString()
             }
             binding.button8.setOnClickListener {
                 input.text = input.text.toString() + number8.text.toString()
             }
             binding.button9.setOnClickListener {
                 input.text = input.text.toString() + number9.text.toString()
             }
             binding.button0.setOnClickListener {
                 input.text = input.text.toString() + number0.text.toString()
             }

             binding.remove.setOnClickListener {
                 input.text = input.text.dropLast(1)
             }


             binding.plus.setOnClickListener {
                 input.text = input.text.toString() + binding.plus.text.toString()
             }

             binding.minus.setOnClickListener {
                 input.text = input.text.toString() + binding.minus.text.toString()
             }

             binding.mult.setOnClickListener {
                 input.text = input.text.toString() + binding.mult.text.toString()
             }

             binding.dev.setOnClickListener {
                 input.text = input.text.toString() + binding.dev.text.toString()
             }




         }



         enum class Operators {
             PLUS,
             MINUS,
             multiplication,
             division


         }




         }

