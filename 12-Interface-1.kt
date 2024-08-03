package com.example.kotlinbasics

fun main(args: Array<String>) {

}
// Can't make object of interface
// Can contain variables
// All method with no body are abstract
// Can contain methods with body
// Subclass must implement all abstract methods
interface A5{
fun method1()
fun method2(){
    println("Method 2 in Interface A5")
}
}

interface A7 {
    fun m1()
}

interface A8:A7 {
    // Interface can inherit another interface but not class and
    // doesn't need to override all abstract methods in super interface
    override fun m1() {
        TODO("Not yet implemented")
    }
}

class demo1():A5,A7{

    override fun method1() {
        TODO("Not yet implemented")
    }

    override fun m1() {
        TODO("Not yet implemented")
    }
}