package br.com.digitalhouse

class Professor(nome: String, sobrenome: String, rd: Int) : Pessoa(nome, sobrenome) {
    init {
        println("Professor $nome criado com rd: $rd")
    }
    fun daAula() {
        println("Professor $nome dando aula")
    }
    fun fazCahamada() {
        println("Professor $nome fazendo chamada")
    }

}