package com.androidatc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declare the variables' values
        var N1=Number1.text
        var N2=Number2.text
        // set the button to add numbers on click
        button_plus.setOnClickListener {
            var sum_result= N1.toString().toDouble()+ N2.toString().toDouble()
            // The results are displayed in result_view
            result_view.text= sum_result.toString()
        }
        // set the button to subtract numbers on click
        button_minus.setOnClickListener {
            var minus_result= N1.toString().toDouble()- N2.toString().toDouble()
            // The results are displayed in result_view
            result_view.text= minus_result.toString()
        }
        // set the button to multiply numbers on click
        button_multiply.setOnClickListener {
            var multiply_result= N1.toString().toDouble() * N2.toString().toDouble()
            // The results are displayed in result_view
            result_view.text= multiply_result.toString()
        }
        // set the button to divide numbers on click
        button_divide.setOnClickListener {
            var divide_result= N1.toString().toDouble() / N2.toString().toDouble()
            // The results are displayed in result_view
            result_view.text= divide_result.toString()
        }
    }
}