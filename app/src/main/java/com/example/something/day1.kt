package com.example.something

import android.renderscript.ScriptGroup.Input

fun main() {
   // // java -> System.out.println()
    // //Kotlin
    println("Hello World")



    //java String name="Nipuana"
    var name : String ="Nipuana"
    var age : Int =10
    var terms : Boolean = false
    var weight : Double =50.50

println("My name is ${name.uppercase()}"+ "and my age is $age")

var data = arrayOf("Nipuana","ram","shyam")

var students = arrayListOf("Nipuana","ram","Shyam")

var student = arrayListOf<Any>("Nipuana",1,true,1035.25)
var ages = ArrayList<Int>()


    students.add("Shyam")
    students.remove("Ram")


println("1st element is ${data[0]}")
println("2nd element is ${data[1]}")
println("3rd element is ${data[2]}")

var lst = listOf("Nipuana")
var lst1= mutableListOf("Nipuana")


var dictionary = mutableMapOf(
    "Tiger" to "This is animal",
    "Bajaj" to "This is Bike",
    "Apple" to "This is fruit"
)

println("Enter any word")
var input : String = readln()
    println(dictionary[input])
    println("Enter day of week")
    var dayOfWeek : Int = readln().toInt()
    var day : String

    when (dayOfWeek){
        1 -> day="Sunday"
        2 -> day ="Monday"
        3 -> day ="Tuesday"
        4 -> day ="Wednesday"
        5 -> day ="Thursday"
        6 -> day ="Friday"
        7 -> day ="Saturday"
        else -> day= "Invalid  opiton"
    }
// //For Loop
//   // java
//    // for (int i=0;i<5;i++){
//    //System.out.println(i)
//}
// //Kotlin

    for (i in 0 until 5  ){
        println(i)
    }
//Function
    fun calculate (a : Int , b: Int): Int{     // use Unit instead of Int if u want no add no return types as if the void in java
        return a+b
}
    fun calculate1 (a : Int , b: Int): Unit{     // use Unit instead of Int if u want no add no return types as if the void in java
        println(a+b)
}


    calculate(1,2)
}
