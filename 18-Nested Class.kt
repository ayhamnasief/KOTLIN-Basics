package com.example.kotlinbasics

fun main(args: Array<String>) {
    var c5 = C5()
    var c6 = C5.C6()
    var c7 = C5().C7()
}

class C5 {
    var x: Int? = null
    class C6 {var x: Int? = null}
    inner class C7 {var y: Int? = x}
}