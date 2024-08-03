package com.example.myapplication_del

fun main(args: Array<String>) {
    // Type 1
    println(var11())
    println(var12())
    println(var13())
    var14()

    // Type 2
    myFun22(22)
    var21(22)
    var22(11,11)

    // Type 3
    println(myFun33())
}

// Type 1
fun myFun11(){println("Hi Jack")}
var var11 = { "Hi Jack" }
var var12 = { -> "Hi Jack" }
var var13:()->Unit = { -> "Hi Jack" }
var var14:()->Unit = { -> println("Hi Jack") }

// Type 2
fun myFun22(a:Int){println("Num: $a")}
var var21:(Int)->Unit = { a->println("Num: $a") }
var var22:(Int,Int)->Unit = { a,b->println("Num: ${a+b}") }


// Type 3
fun myFun33():String{return "Hi Jack"}
var var31:()->String = { -> "Hi Jack"}

// Type 4
fun myFun41(a:Int):Int{return a*a}
var var41: (Int)->Int = {a->a*a}
fun myFun42(a:Int,b:Int):Int{return a+b}
var var42:(Int,Int)->Int = {a,b->a+b}

