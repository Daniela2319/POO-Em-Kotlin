package Encapsulamento
//Exemplo de Encapsulamento classe pessoa, que invocada no teste main

class Pessoa {

    private var nome: String = ""
    private var idade: Int = 0
    private var cidade: String = ""

    fun setNome(nome:String){
        this.nome = nome
    }

    fun setIdade(idade:Int){
        this.idade = idade
    }

    fun setCidade(cidade:String){
        this.cidade = cidade
    }

    fun exibirDados(){
        println("Nome: $nome")
        println("Idade: $idade")
        println("Cidade: $cidade")
    }
}

fun main(){

    val pessoa = Pessoa()

    pessoa.setNome("Valdemar")
    pessoa.setIdade(38)
    pessoa.setCidade("Fazenda Rio Grande")
    pessoa.exibirDados()

}