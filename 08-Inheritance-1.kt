package com.example.kotlinbasics

fun main(args: Array<String>) {
var b = B("Ayham Nassif")
}

open class A{
    var age:Int = 30
    constructor(name:String){
        println("A"+this.age)
    }
}

open class B(name: String) : A(name) {
}

class C:B{
    var sss:String = "aaa"
    constructor(name:String):super(name)
}