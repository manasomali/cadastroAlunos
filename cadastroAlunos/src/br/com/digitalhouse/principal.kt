package br.com.digitalhouse

import java.util.Scanner

fun main () {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var integer:Int = reader.nextInt()
    println("You entered: $integer")
}