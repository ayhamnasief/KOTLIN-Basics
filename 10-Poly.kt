package com.example.myapplication_del

fun main(args: Array<String>) {
var sh = Shape()
    println("sh: "+sh.draw())

    var rec = Rec()
    println("rec: "+rec.draw())

    var sq = Square()
    println("sq: "+sq.draw())

    var cir = Circle()
    println(cir.printVal(sh, rec, sq))

    var sh2:Shape = Square()
    println("Poly - sh2: "+sh2.draw())

    var shapes = ArrayList<Shape>()
    shapes.add(sh)
    shapes.add(rec)
    shapes.add(sq)
}

open class Shape{
    open fun draw(){
        println("draw from Shape")
    }

    open fun drawSpecial(){
        println("drawSpecial from Shape")
    }
}

class Rec:Shape(){
    override fun draw() {
        println("draw From Rec")
    }
}

class Square:Shape(){
    override fun draw() {
        println("draw from Square")
    }
}

class Circle(){
    fun printVal(sh:Shape, rec:Rec, sq:Square){
        sh.draw()
        rec.draw()
        sq.draw()
    }
}


