package com.example.kotlinbasics

fun main(args: Array<String>) {
val rec1 = Rec()
    val circle = Circle()
    println(rec1.name1) // Ayham Nassif
    println(rec1.name2) // Ayham Nassif
    println(circle.name1)
    println(circle.name2)
    circle.print()
}

open class Shap{
    constructor() // Any class has always empty
val name1:String="Shap"
    open val name2:String="Shap"
}

open class Rec: Shap() { // Shap() or in class body constructor()
// val name1:String="Ayham Nassif" Wrong override
    override val name2: String="Rec"
}

class Circle:Rec{
    constructor()

    override val name2: String="Circle"

    fun print(){
        println(super.name2)
    }
}