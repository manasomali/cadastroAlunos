package br.com.digitalhouse

import java.util.Scanner

fun main () {
    println("--------------MENU-------------")
    println("1. Criar Aluno")
    println("2. Criar Professor")

    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var integer:Int = reader.nextInt()
    println("You entered: $integer")
}