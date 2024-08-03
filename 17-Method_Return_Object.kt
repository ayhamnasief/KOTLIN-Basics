package com.example.kotlinbasics

fun main(args: Array<String>) {
var c4 = C4()
    var value1:Int? = c4.getObj().x
}

class C3{
    var x:Int?=null
}

class C4{
    fun getObj():C3{
        var c3 = C3()
        return c3
    }
}