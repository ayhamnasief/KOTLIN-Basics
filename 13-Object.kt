package com.example.kotlinbasics

fun main(args: Array<String>) {
var c2 = C2()
    println(c2.a)
    println(Obj.a) // No need to create object

    Books.myBooks.add("Java")
    Books.myBooks.add("Java")
    Books.myBooks.add("Java")
    Books.myBooks.add("Java")

    Books.printBooks1()
    Books.printBooks2(Books.myBooks)
}

object Obj{
    var a:Int?=1
}

class C2{
    var a:Int?=1
}

object Books{
    var myBooks = ArrayList<String>()

    fun printBooks1(){
        for (i in myBooks){
            println(i)
        }
    }

    fun printBooks2(myBooks:ArrayList<String>){
        for (i in myBooks){
            println(i)
        }
    }
}