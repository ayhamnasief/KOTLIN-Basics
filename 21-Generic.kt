package com.example.kotlinbasics

// T = Type parameter
// First2 = Generic class
fun main(args: Array<String>) {
    var first21 = First2<Int>()
    first21.genericVal = 10
    first21.printGenVal(10)
    println(first21.getAndReturnGen(10))

    var first22 = First2<String>()
    first22.genericVal = "Ayham Nassif"
    first22.printGenVal("Ayham Nassif")
    println(first22.getAndReturnGen("Ayham Nassif"))

    var first31 = First3<Int, String>()
    first31.num1 =10
    first31.num2="Ayham Nassif"
    first31.demo(10, "Ayham Nassif")

    var first32 = First3<String, Int>()
    first32.num1 ="Ayham Nassif"
    first32.num2=10
    first32.demo("Ayham nassif", 10)
}

class First2<T>{
    var genericVal:T?=null
    fun printGenVal(a:T){println(a)}
    fun getAndReturnGen(a:T):T{return a}
}

class First3<T,E>{
    var num1:T?=null
    var num2:E?=null

    fun demo(a:T,b:E){println("Par1: ${a} and Par2: ${b}")}
}