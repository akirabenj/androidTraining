package com.example.hello

class Car: Movable {

    var color: String
    var power: Int

    constructor(color: String, power: Int) {
        this.color = color
        this.power = power
    }

    override fun go(): String {
        return "машина поехала вперед"
    }

    override fun stop(): String {
        return "машина остановилась"
    }
}