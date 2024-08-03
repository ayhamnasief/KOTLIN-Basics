package com.example.kotlinbasics

fun main(args: Array<String>) {

}

abstract class Shape3(){
  // We can't make object of it
  // Used for superclass
}

open abstract class Shape4{ // If subclass is not abstract, You should override all abstract method
open abstract fun sh6() // Must be in abstract class and no body for abstract method
}

abstract class Shape5(): Shape4() {
    override fun sh6() {
        TODO("Not yet implemented")
    }
}