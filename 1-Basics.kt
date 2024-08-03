package com.example.kotlinbasics

fun main(args: Array<String>) {
    var num1 = 1
    num1 = 6
    val num2 = 2
    // num2 = 3 Wrong - Can't re-assign value to val variable
    println("Sum: ${num1+num2}")
    println("$num1 and $num2")

    var initVal1:Int // variable has null value but you can't print
    var initVal2:Int ?= null // variable has null value
    println(initVal2)

    val x9:Int ?= null
    println(x9?.toLong()) // print null if x9 is null else convert to long

    var x10 = 100
    var x11 = x10 ?: 10 // Assign 10 if x9 is null (Elvis)
    println(x11)

    var char1 ='A'
    var char2:String = char1.toString() // Same issue we have: toDouble toInt etc..

    var num3 = 1
    num3.toDouble()
    println(num3)

    var name = "Jack"
    println(name[1])

    // Arithmetic Operators
    var num8 = 1
    var num9 = 2
    println("${num8 + num9}")
    println("Sum = ${num8 + num9}")
    println(num8+num9)

    // Assignment Operators
    var num10 = 2
    println(num10)
    num10 =5
    println(num10)
    num10 = num10+5
    println(num10)
    num10 +=5
    println(num10)
    num10 %=2
    println(num10) // 5%2 = 1

    // Comparison Operators
    var num4 = 15
    var num5 = 2

    println("Res: ${num4 == num5}") // false
    println("Res: ${num4 != num5}") // true
    println("Res: ${num4 < num5}") // false
    println("Res: ${num4 > num5}") // true
    println("Res: ${num4 >= num5}") // true
    println("Res: ${num4 <= num5}") // false

    // If
    var isCold = false
    var num6 = if (isCold){
        "Cold"
    }else{ // You must add else
        30
    }
    println(num6)

    if (2==2){
        println("Equals")
    }else{
        println("Not Equals")
    }

    // When
    when(isCold){
        true -> "true"
        false -> "false"
    }

    when(isCold){
        true -> println("true")
        false -> println("false")
    }

    var window = when(isCold){
        true -> println("true")
        false -> println("false")
    }

    var num7 = 40
    when(num7){
        20 -> println("20")
        30,
        40 -> println("false")
    }

    // While
    var num11 = 1
    while (num11<10){
        println(num11)
        num11 +=1
    }

    // do while
    do {
        println(num11)
        num11 +=1
    }while (num11<10)

    // For
    for (num8 in 1..10){
        println(num8)
    }

    for (num8 in 1..10){
        println(num8)
        if (num8 == 2) continue // == not only =
        if (num8 == 8) break // == not only =
    }

    for (num8 in 1 until 10){
        println(num8)
    }

    for (num8 in 1..10 step 2){
        println(num8)
    }

    for (num8 in 10 downTo 1){
        println(num8)
    }
}

