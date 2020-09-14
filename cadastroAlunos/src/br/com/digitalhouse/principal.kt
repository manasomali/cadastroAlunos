package br.com.digitalhouse

import java.util.Scanner

fun main () {
    val listaAlunos = listOf<Aluno>()
    val listaProfessor = listOf<Professor>()
    val listaCurso = listOf<Curso>()
    val listaMateria = listOf<Materia>()
    val listaTurma = listOf<Turma>()

    println("--------------MENU-------------")
    println("1. Criar Aluno")
    println("2. Criar Professor")
    println("3. Criar Curso")
    println("4. Criar Materia")
    println("5. Criar Turma")
    println("6. Exibir Dados Gerais")
    val reader = Scanner(System.`in`)
    print("Enter com opção: ")
    var opcao:Int = reader.nextInt()

    when (opcao) {
        1 -> criaAluno(listaAlunos)
        2 -> criaProfessor()
        3 -> criaCurso()
        4 -> criaMateria()
        5 -> criaTurma()
        6 -> exibeDadosGerais()
        else -> println("Informe um numero de 1 a 6")
    }
}
fun criaAluno(listaAlunos) {
    val reader1 = Scanner(System.`in`)
    print("Informe o nome do aluno: ")
    var nome:String = reader1.nextLine()
    val reader2 = Scanner(System.`in`)
    print("Informe o sobrenome: ")
    var sobrenome:String = reader2.nextLine()
    val reader3 = Scanner(System.`in`)
    print("Informe o sobrenome: ")
    var ra:Int = reader3.nextInt()
    listaAlunos.add(Aluno(nome, sobrenome, ra))
}
fun criaProfessor() {

}
fun criaCurso() {

}
fun criaMateria() {

}
fun criaTurma() {

}
fun exibeDadosGerais() {
    for (aluno in listaAlunos)
        println(aluno)
}