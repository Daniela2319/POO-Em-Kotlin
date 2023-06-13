
// classe Mãe Animal na orientação objeto Herança
 open class Animal (val nome:String, val idade: Int){
    open fun fazerBarulho(){
        println("O animal está fazendo barulho!")
    }
     open fun comerCarne(){
         println("No almoço!")
     }
}
//classe Filha cachorro
 class Cachorro(nome: String, idade: Int): Animal(nome, idade){
     override fun fazerBarulho() {
         println("O cachorro esta latindo!")
     }

     override fun comerCarne() {
         println("Não come carne!")
     }
 }

//classe filha gato
 class Gato(nome: String, idade: Int) : Animal(nome, idade ){
     override fun fazerBarulho() {
         println("O gato esta miando!")
     }

     override fun comerCarne() {
         println("Come carne no Jantar!")
     }
 }
// comando main faze o teste das nossas classes
 fun main(){
     val animal: Animal = Cachorro("Preto",5)
     animal.fazerBarulho()
     animal.comerCarne()

     val animal2: Animal = Gato("Mingau",8)
     animal2.fazerBarulho()
     animal2.comerCarne()
 }