package com.example.hello
import kotlin.math.sqrt

interface IFigure {
    fun perimeter(): Float
    fun square(): Float
}

class Square: IFigure {

    var sideValue: Int

    constructor(sideValue: Int) {
        this.sideValue = sideValue
    }

    override fun perimeter(): Float {
        return (sideValue * 4).toFloat()
    }

    override fun square(): Float {
        return (sideValue * sideValue).toFloat()
    }

}

class Triangle: IFigure {

    var sideValue: Int

    constructor(sideValue: Int) {
        this.sideValue = sideValue
    }

    override fun perimeter(): Float {
        return (sideValue * 3).toFloat()
    }

    override fun square(): Float {
        val coef = sqrt(3.0) / 4
        return (coef * sideValue * sideValue).toFloat()
    }

}