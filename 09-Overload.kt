package com.example.kotlinbasics

fun main(args: Array<String>) {
var a = OverLoad()
    a.sum()
}

class OverLoad{
    fun sum(){}
    fun sum(num1:Int){}
    fun sum(num1:Int?){}
    fun sum(str1:String){}
    // fun sum(str1:String?){} Wrong
    fun sum(num1:Int,str1:String){}
    fun sum(num1:Int?,str1:String){}
    fun sum(str1:String, num1:Int){}

    constructor(){
        println("Hi")
    }
    constructor(str:String){
        println(str)
    }
}