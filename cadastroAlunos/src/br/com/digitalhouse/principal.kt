package br.com.digitalhouse

import java.util.Scanner

fun main () {
    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessor = mutableListOf<Professor>()
    var listaCurso = mutableListOf<Curso>()
    var listaMateria = mutableListOf<Materia>()
    var listaTurma = mutableListOf<Turma>()

    println("--------------MENU-------------")
    println("1. Criar Aluno")
    println("2. Criar Professor")
    println("3. Criar Curso")
    println("4. Criar Materia")
    println("5. Criar Turma")
    println("6. Exibir Dados Gerais")
    var reader = Scanner(System.`in`)
    print("Enter com opção: ")
    var opcao:Int = reader.nextInt()

    when (opcao) {
        1 -> {
            reader = Scanner(System.`in`)
            print("Informe o nome do aluno: ")
            var nome:String = reader.nextLine()
            reader = Scanner(System.`in`)
            print("Informe o sobrenome: ")
            var sobrenome:String = reader.nextLine()
            reader = Scanner(System.`in`)
            print("Informe o registro academico: ")
            var ra:Int = reader.nextInt()
            listaAlunos.add(Aluno(nome, sobrenome, ra))
        }
        2 -> {
            reader = Scanner(System.`in`)
            print("Informe o nome do professor: ")
            var nome:String = reader.nextLine()
            reader = Scanner(System.`in`)
            print("Informe o sobrenome: ")
            var sobrenome:String = reader.nextLine()
            reader = Scanner(System.`in`)
            print("Informe o registro docente: ")
            var rd:Int = reader.nextInt()
            listaProfessor.add(Professor(nome, sobrenome, rd))
        }
        3 -> criaCurso()
        4 -> criaMateria()
        5 -> criaTurma()
        6 -> {
            for (aluno in listaAlunos)
                println("${aluno.nome} ${aluno.sobrenome}")
        }
        else -> println("Informe um numero de 1 a 6")
    }
}

fun criaProfessor() {

}
fun criaCurso() {

}
fun criaMateria() {

}
fun criaTurma() {

}