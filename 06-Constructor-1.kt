package com.example.kotlinbasics

fun main() {
    val player1 = Player1("Ayham", 60)
    println(player1.name)
    player1.play()

    var p2 = Player2()
    println(p2.name)
}

class Player1(var name: String, var speed: Int) {
    init {
        println("Application started")
    }

    fun play() {
        println(speed)
    }
}

class Player2(var name: String? = null, var speed: Int? = null) {
    init {
        println("Hi")
        name = "Ayham"
        speed = 100
    }
}