package com.example.kotlinbasics

fun main(){

val player3 = Player3()
    player3.name="Ayham Nassif"
    println(player3.name)

    val player4 = Player4()
    player4.name = "Ayham Nassif"
    println(player4.name)

    lateinit var any:String // Works only with String variables
}

// Getter
class Player3(){
var name=""
    get() {return "Player: $field"} // related to name
}

// Setter
class Player4(){
    var name=""
        set(value) {field = "Player: $value"}
}