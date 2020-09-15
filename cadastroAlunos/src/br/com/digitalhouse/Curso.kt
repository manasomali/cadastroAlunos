package br.com.digitalhouse

class Curso(val nome: String,
            val listaAlunos: MutableList<Aluno>,
            val listaAulas: MutableList<Aula>,
            val professorResponsavel: Professor)