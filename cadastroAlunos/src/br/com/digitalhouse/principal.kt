package br.com.digitalhouse

import java.util.*

fun main() {


    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessor = mutableListOf<Professor>()
    val listaCurso = mutableListOf<Curso>()
    val listaAula = mutableListOf<Aula>()
    val listaTurma = mutableListOf<Turma>()

    val cont = 1

    while (cont > 0) {

        println("------------- MENU ------------")
        println("1. Criar aluno")
        println("2. Criar professor")
        println("3. Criar curso, matéria e aulas")
        println("4. Criar turma")
        println("5. Exibir todos os dados")
        val reader = Scanner(System.`in`)
        print("Enter com opção: ")
        try {
            when (reader.nextInt()) {
                1 -> {
                    print("Informe o nome do aluno: ")
                    val nome: String = reader.next()
                    print("Informe o sobrenome: ")
                    val sobrenome: String = reader.next()
                    print("Informe o registro acadêmico: ")
                    val ra: Int = reader.nextInt()
                    listaAlunos.add(Aluno(nome, sobrenome, ra))
                }
                2 -> {
                    print("Informe o nome do professor: ")
                    val nome: String = reader.next()
                    print("Informe o sobrenome: ")
                    val sobrenome: String = reader.next()
                    print("Informe o registro de docente: ")
                    val rd: Int = reader.nextInt()
                    listaProfessor.add(Professor(nome, sobrenome, rd))
                }
                3 -> {
                    if (listaAlunos.size == 0 || listaProfessor.size == 0) {
                        println("\nÉ necessário criar alunos e professores primeiro.\n")
                    } else {
                        print("Informe o nome do curso: ")
                        val nomeCurso: String = reader.next()
                        print("Informe a quantidade de aulas: ")
                        val quantAulas: Int = reader.nextInt()
                        for (aula in 1..quantAulas) {
                            print("Informe a matéria da aula $aula: ")
                            val materia: String = reader.next()
                            print("Informe o horário de início da aula $aula: ")
                            val horainicio: String = reader.next()
                            print("Informe o horário de fim da aula $aula: ")
                            val horafim: String = reader.next()
                            listaAula.add(Aula(materia, horainicio, horafim))
                        }
                        var i = 0
                        while (i < listaProfessor.size) {
                            println("$i. ${listaProfessor[i].nome} ${listaProfessor[i].sobrenome}")
                            ++i
                        }
                        print("Informe o index do professor: ")
                        val index: Int = reader.nextInt()
                        listaCurso.add(Curso(nomeCurso, listaAlunos, listaAula, listaProfessor[index]))
                    }
                }
                4 -> {
                    if (listaCurso.size == 0) {
                        println("\nÉ necessário criar um curso primeiro.\n")
                    } else {
                        print("Informe o nome da turma: ")
                        val nome: String = reader.next()
                        var i = 0
                        while (i < listaCurso.size) {
                            println("$i. ${listaCurso[i].nome}")
                            ++i
                        }
                        print("Informe o index do curso: ")
                        val index: Int = reader.nextInt()
                        listaTurma.add(Turma(nome, listaCurso[index]))
                    }
                }
                5 -> {
                    for (aluno in listaAlunos) {
                        println("\nTodos os alunos")
                        println("${aluno.ra} - ${aluno.nome} ${aluno.sobrenome}")
                    }
                    for (professor in listaProfessor) {
                        println("\nTodos os professores")
                        println("${professor.rd} - ${professor.nome} ${professor.sobrenome}")
                    }
                    for (curso in listaCurso) {
                        println("\nTodos os cursos")
                        println({ curso.nome })
                    }
                    for (aula in listaAula) {
                        println("\nTodas as aulas")
                        println("Matéria: ${aula.materia}, das ${aula.horarioInicio} às ${aula.horarioFim}")
                    }
                    for (turma in listaTurma) {
                        println("\nTodas as turmas")
                        println("Turma ${turma.nome} - Curso: ${turma.curso.nome}")
                    }
                }
                else -> println("Informe um número de 1 a 5")
            }
        } catch (e: InputMismatchException) {
            System.out.println("\nUse apenas números inteiros.\n")
            reader.nextLine()
        }

    }
}