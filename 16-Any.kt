package com.example.kotlinbasics

fun main(args: Array<String>) {
    //Casting
    var x:Int=10
    var y:Double
    y=x.toDouble()

    // Any as parameter
    var objF = First1()
    Demo1.show(objF)

    //Any as return type
    var objS = Second1()
    objS = Demo1.returnShow1() as Second1 // Down casting

    var objT = Third1()
    objT = Demo1.returnShow3() as Third1 // Down casting
}

class First1{
    fun printFirst1(){
        println("First1")
    }
}
class Second1{
    fun printSecond1(){
        println("Second1")
    }
}
class Third1{
    fun printThird1(){
        println("Third1")
    }
}
class Demo1{
    companion object{
        fun show(any:Any){
            any as First1
            any.printFirst1()
        }

        fun returnShow1():Any{
            var objS = Second1()
            return objS
        }

        fun returnShow3():Any{
            var objT = Third1()
            return objT
        }
    }

}