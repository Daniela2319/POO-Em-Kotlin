// Polimorfismo em Kotlin calculando as formas geometricas

 open class FormaGeometria() {
     protected val area: Double = 0.0
     private val perimetro: Double = 0.0

     open fun calcularArea(): Double{
         return 0.0
     }
     open fun calculaPerimetro(): Double{
         return 0.0
     }
}

 class Retangulo(private val largura: Double, private val altura: Double) : FormaGeometria(){
     override fun calcularArea(): Double {
         return largura * altura
     }

     override fun calculaPerimetro(): Double {
         return 2 * largura * 2 * altura
     }
 }

 class Circulo(private val raio: Double) : FormaGeometria(){
     override fun calcularArea(): Double {
         return Math.PI * raio * raio
     }

     override fun calculaPerimetro(): Double {
         return Math.PI * raio
     }
 }

 fun main() {
     val retangulo = Retangulo(5.0, 3.5)

     val circulo = Circulo(5.0)

     val formas: Array<FormaGeometria> = arrayOf(retangulo, circulo)
     for (forma in formas) {
         println("Area: ${forma.calcularArea()} - Perimentro: ${forma.calculaPerimetro()}")
     }

 }