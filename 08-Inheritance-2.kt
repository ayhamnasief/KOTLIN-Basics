package com.example.kotlinbasics

fun main(){
var man = Man("Ayham", "IT")
    println(man.name)
    println(man.age)
    man.myPrint()
    man.xxx()
}

open class Human(var name:String){
    var age = 30

    fun myPrint(){
        println("Hi from Human class")
    }

    fun xxx(){
        name = "Bassel"
        println(name)
    }
}
class Man2:Human{constructor(name:String):super(name)}

class Man(name:String, var position: String):Human(name){}
class Women(name:String, var city: String):Human(name){}
