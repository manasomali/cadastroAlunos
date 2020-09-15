package br.com.digitalhouse

class Professor(nome: String, sobrenome: String, val rd: Int) : Pessoa(nome, sobrenome) {
    init {
        println("\nCriado: professor $nome $sobrenome ($rd)\n")
    }

    fun daAula() {
        println("Professor $nome dando aula")
    }

    fun fazCahamada() {
        println("Professor $nome fazendo chamada")
    }

}