package com.example.kotlinbasics

fun main(args: Array<String>) {

var obj = object :MyInterface{
    override fun show() {
        println("Implemented from Anonymose Class")
    }
}

    // Section 1
    obj.show()

    // Section 2
    var a91 = A9()
    a91.poly(obj) // It means we can use classes implements MyInterface as a parameter

    // Section 3
    var a10 = A10()

    var a92 = A9()
    a92.poly(a10) // It means we can use classes implements MyInterface as a parameter

    // Section 4
    var a93 = A9()
    a93.poly(object : MyInterface{
        override fun show() {
            println("Implemented from object itself")
        }
    })
}


interface MyInterface{
fun show()
}

class A9{
    fun poly(myInterface:MyInterface){
        myInterface.show()
    }
}

class A10:MyInterface{
    override fun show() {
        println("Implemented from Class A10")
    }

}