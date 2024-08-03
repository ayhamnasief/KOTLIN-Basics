package com.example.kotlinbasics


fun main() {
    greeting()
    greeting(4)
    greeting(2,3)

    var var1 = cal(2,2)
    println(var1)
    println(cal(3,3))

    var var2:()->String = {"Bassel Nassif"}
    println(var2()) // you must add ()

    var var3:(Int)->String = {"Num: $Int"}
    println(var3(10))
}

fun greeting(){
    println("ho")
}

fun greeting(num:Int){
    println("hi $num")
}

fun greeting(num1:Int, num2:Int){
    println("Hi ${num1+num2}")
}

// Call: greeting(1,4) second pass value will assign to second parameter
// Call: greeting(1,num3=4) second pass value will assign to third parameter
// Call: greeting(num3=4,1)
fun greeting(num1:Int, num2:Int=3, num3:Int=10){
    println("Hi ${num1+num2+num3}")
}

fun cal(num1:Int, num2:Int):Int{
    return num1+num2
}

// Another way
fun fun2(num1:Int, num2:Int):Int = num1+num2

