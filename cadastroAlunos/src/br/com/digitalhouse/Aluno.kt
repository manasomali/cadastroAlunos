package br.com.digitalhouse

class Aluno(nome: String, sobrenome: String, val ra: Int) : Pessoa(nome, sobrenome) {
    init  {
        println("Aluno $nome criado com ra: $ra")
    }

    fun assistirAula() {
        println("Aluno $nome fazendo a lição")
    }
    fun fazerLicao() {
        println("Aluno $nome assistindo aula")
    }
}