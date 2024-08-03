package com.example.myapplication_del

fun main(args: Array<String>) {
    var x = "Hello"
    myHOF(x, ::rever)
    myHOF(x, lambdaRever)
    myHOF(x){s:String -> "lambdaRever: " + s.reversed()}
    myHOF(x){s -> "lambdaRever: " + s.reversed()}
}

fun myHOF(d:String, myFun:(String) -> String){
    println(myFun(d))
}

fun rever(s:String):String{
    return "fun rever: " + s.reversed()
}

// val lambdaRever2: (String) -> String = {s -> s.reversed()}
val lambdaRever = {s:String -> "lambdaRever: " + s.reversed()}