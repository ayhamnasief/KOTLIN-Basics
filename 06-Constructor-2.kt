package com.example.kotlinbasics

fun main(args: Array<String>) {
var ali = Student("Ayham", "Nassif")
}

class Student{
    var fName:String?=null
    var lName:String?=null
    var id:Int?=null

    constructor(fName: String, lName: String?, id: Int?=1) {
        this.fName = fName
        this.lName = lName
        this.id = id
        println("$fName"+" "+lName)
    }
}