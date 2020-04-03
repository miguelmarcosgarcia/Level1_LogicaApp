package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica.*

class LogicaActivity : AppCompatActivity() {
    private val valTrue = "T"
    private val valFalse = "F"
    private var correctAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)

        submitBtn.setOnClickListener {
            checkInput()
        }
    }

    private fun numberCorrectAnswers() {
        if (row1.text.toString() == valTrue) {
            correctAnswers += 1
        }
        if (row2.text.toString() == valFalse) {
            correctAnswers += 1
        }
        if (row3.text.toString() == valFalse) {
            correctAnswers += 1
        }
        if (row4.text.toString() == valFalse) {
            correctAnswers += 1
        }
    }


    private fun checkInput() {
        numberCorrectAnswers()

        Toast.makeText(this, getString(R.string.correctAnswers, correctAnswers), Toast.LENGTH_LONG).show()
        //Initialize again count to 0
        correctAnswers = 0
    }
}
