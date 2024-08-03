package com.example.kotlinbasics

fun main(args: Array<String>) {
var c1 = C1(1.1)
c1.draw("First Circle")
    println(c1.getAria())
}

interface I1{
    fun draw(color:String)
    fun getAria():Double
}

class C1:I1{
    private var radius:Double?=null
    constructor(p_radius:Double){this.radius=p_radius}

    override fun draw(color: String) {
        println(color)
    }

    override fun getAria(): Double {
        return Math.PI* this.radius!! * this.radius!!
    }
}