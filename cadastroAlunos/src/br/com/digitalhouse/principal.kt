package br.com.digitalhouse

import java.util.Scanner

fun main () {
    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessor = mutableListOf<Professor>()
    var listaCurso = mutableListOf<Curso>()
    var listaAula = mutableListOf<Aula>()
    var listaTurma = mutableListOf<Turma>()

    var cont = 1

    while (cont > 0) {

        println("--------------MENU-------------")
        println("1. Criar Aluno")
        println("2. Criar Professor")
        println("3. Criar Curso, Materia e Aulas")
        println("4. Criar Turma")
        println("5. Exibir Dados Gerais")
        val reader = Scanner(System.`in`)
        print("Enter com opção: ")
        var opcao:Int = reader.nextInt()

        when (opcao) {
            1 -> {
                val reader1 = Scanner(System.`in`)
                print("Informe o nome do aluno: ")
                var nome:String = reader1.nextLine()
                val reader2 = Scanner(System.`in`)
                print("Informe o sobrenome: ")
                var sobrenome:String = reader2.nextLine()
                val reader3 = Scanner(System.`in`)
                print("Informe o registro academico: ")
                var ra:Int = reader3.nextInt()
                listaAlunos.add(Aluno(nome, sobrenome, ra))
            }
            2 -> {
                val reader1 = Scanner(System.`in`)
                print("Informe o nome do professor: ")
                var nome:String = reader1.nextLine()
                val reader2 = Scanner(System.`in`)
                print("Informe o sobrenome: ")
                var sobrenome:String = reader2.nextLine()
                val reader3 = Scanner(System.`in`)
                print("Informe o registro docente: ")
                var rd:Int = reader3.nextInt()
                listaProfessor.add(Professor(nome, sobrenome, rd))
            }
            3 -> {
                val reader1 = Scanner(System.`in`)
                print("Informe o nome curso: ")
                var nomeCurso:String = reader1.nextLine()
                val reader2 = Scanner(System.`in`)
                print("Informe a quantidade de aulas: ")
                var quantAulas:Int = reader2.nextInt()
                for(aula in 1..quantAulas) {
                    var reader3 = Scanner(System.`in`)
                    print("Informe a materia da aula $aula: ")
                    var materia: String = reader3.nextLine()
                    val reader4 = Scanner(System.`in`)
                    print("Informe o horario de inicio da aula $aula: ")
                    var horainicio: String = reader4.nextLine()
                    val reader5 = Scanner(System.`in`)
                    print("Informe o horario de fim da aula $aula: ")
                    var horafim: String = reader5.nextLine()
                    listaAula.add(Aula(materia, horainicio, horafim))
                }
                var i = 0
                while (i < listaProfessor.size) {
                    println("$i. ${listaProfessor[i].nome} ${listaProfessor[i].sobrenome}")
                    ++i
                }
                val reader6= Scanner(System.`in`)
                print("Informe o index do professor: ")
                var index:Int = reader6.nextInt()
                listaCurso.add(Curso(nomeCurso, listaAlunos, listaAula, listaProfessor[index]))
            }
            4 -> {
                val reader1= Scanner(System.`in`)
                print("Informe o nome da turma: ")
                var nometurma:String = reader1.nextLine()
                var i = 0
                while (i < listaCurso.size) {
                    println("$i. ${listaCurso[i].nome}")
                    ++i
                }
                val reader2= Scanner(System.`in`)
                print("Informe o index do curso: ")
                var index:Int = reader2.nextInt()
                listaTurma.add(Turma(nometurma,listaCurso[index]))
            }
            5 -> {
                for (aluno in listaAlunos)
                    println("${aluno.nome} ${aluno.sobrenome}")
                for (professor in listaProfessor)
                    println("${professor.nome} ${professor.sobrenome}")
                for (curso in listaCurso)
                    println("${curso.nome}")
                for (aula in listaAula)
                    println("Materia: ${aula.materia} Inicio: ${aula.horarioInicio} Fim: ${aula.horarioFim}")
                for (turma in listaTurma)
                    println("Turma: ${turma.nome} Curso: ${turma.curso}")

            }
            else -> println("Informe um numero de 1 a 6")
        }
    }
}