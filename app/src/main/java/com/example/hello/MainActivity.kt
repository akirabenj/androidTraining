package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textView: TextView? = null
    var input1: TextView? = null
    var input2: TextView? = null
    var button: Button? = null
    var triangle: IFigure? = null
    var square: IFigure? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        input1 = findViewById(R.id.editText1)
        input2 = findViewById(R.id.editText2)
        button = findViewById(R.id.button)

        button?.setOnClickListener {
            createFigures()
        }
    }

    private fun printValue(value: Any) {
        textView?.text = value.toString()
    }

    private fun createFigures() {
        val sideValueT = input1?.text.toString().toInt()
        val sideValueS = input2?.text.toString().toInt()
        triangle = Triangle(sideValueT)
        square = Square(sideValueS)
        val triangleP = "P треугольника: ${triangle?.perimeter()}"
        val triangleS = "S треугольника: ${triangle?.square()}"
        val squareP = "P квадрата: ${square?.perimeter()}"
        val squareS = "S квадрата: ${square?.square()}"
        val array = arrayOf(triangleP, triangleS, squareP, squareS)

        var result = ""

        for(s in array) {
            result += s + "\n"
        }

        printValue(result)
    }

}