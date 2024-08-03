package com.example.kotlinbasics

fun main(args: Array<String>) {
}

open class First{
}

class Second: First() {
}

class Third {
}

class Fourth{
fun printFourth(){
    println("Class Fourth")
}
}

class Demo{

    companion object {

        fun returnShow1(): First {
            var objF = First()
            return objF
        }

        fun returnShow2(): First {
            var objS = Second()
            return objS
        }

        fun returnShow3(): Second {
            var objS = Second()
            return objS
        }

        fun returnShow4(): Any {
            var objT = Third()
            return objT
        }

        fun show(any: Any) {
        }

        fun m2():Any{
            return Any()
        }
    }
}