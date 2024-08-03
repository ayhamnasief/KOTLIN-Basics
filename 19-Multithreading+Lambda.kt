package com.example.kotlinbasics

import kotlinx.coroutines.Runnable

fun main(args: Array<String>) {
    var objH:Runnable = HP()
    var objD:Runnable = DELL()

    var t1 = Thread(objH)
    var t2 = Thread(objD)

    t1.start()
    Thread.sleep(500)
    t2.start()

    var objH1 = object : Runnable {
        override fun run() {
            for (i:Int in 0 until 5){
                println("HP")
                Thread.sleep(1000)
            }
        }

    }

    var objD1 = Runnable { // Lambda expression implement on functional interface (Interface has only one abstract method)
        for (i:Int in 0 until 5){
            println("DELL")
            Thread.sleep(1000)
        }
    }
}

class HP:Runnable{
    override fun run() {
        for (i:Int in 0 until 5){
            println("HP")
            Thread.sleep(1000)
        }
    }

}

class DELL:Runnable{
    override fun run() {
        for (i:Int in 0 until 5){
            println("DELL")
            Thread.sleep(1000)
        }
    }

}