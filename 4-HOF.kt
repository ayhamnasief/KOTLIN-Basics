package com.example.myapplication_del

// Section 1
var lambda1: () -> Unit = {-> println("No in No out") } // Type 1
var lambda2:()->String = {-> "No in, Return String"} // Type 2
var lambda3:(Int)->Unit = {a -> println("Ayham Nassif") } // Type 3
var lambda4:(Int)->Int = {a -> a+a } // Type 4
var lambda5: (Int, Int) -> Int = {a,b -> a+b} // Type 4

// Section 2
fun sum1 (a:Int, b:Int, myfun:(Int)->Int):Int{
    return a+b
}

fun sum2 (a:Int, b:Int, myfun:(Int,Int)->Int):Int{
    return a+b
}

fun sum3 (a:Int, b:Int, myfun:(Int,Int)->Int):Int{
    return myfun(a,b)
}

fun sum4 (a:Int, b:Int, myfun:(Int,Int)->Int){
    println("Sum: " + myfun(a,b))
}

fun sum5(a:Int, b:Int):Int{
    return a+b
}

fun main(args: Array<String>) {
    println(sum1(1,2,lambda4))
    println(sum2(1,2,lambda5))
    println(sum3(1,2,lambda5))
    sum4(1,2,lambda5)
    sum4(1,2,{a,b -> a+b})
    sum4(1,2) {c,d -> c+d}
    println(sum4(1,2, ::sum5))
}

