package com.example.kotlinbasics

fun main(args: Array<String>) {
    println(Test1.A.n)
    Test1.A.printWelcome1()
    Test1.B.printWelcome1()
    Test1.C.printWelcome1()

}
// can't create object
// constructor is must and private
enum class Test1{
    A(1,"Bassel"),B(2,"Ayham"),C(3,"Rama"),D(4,"Riham"); // ; is must
    var num:Int?=null
    var n:String?=null

    private constructor(p_num:Int, p_n: String){
        this.num = p_num
        this.n = p_n
    }
    fun printWelcome1(){
        println("Welcome")
    }
}

enum class Test2{
    A(1,"Bassel") { // ; is must
        override fun printWelcome2() {
            println("A")
        }
    };

    var num:Int?=null
    var n:String?=null

    private constructor(p_num:Int, p_n: String){
        this.num = p_num
        this.n = p_n
    }

    abstract fun printWelcome2()

}