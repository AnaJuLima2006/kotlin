//Hora de codar Três, exercício Dois!!
// Crie uma bomba relógio (usando somente código - para deixar claro!) contagem cuja
//regressiva vai de 30 a 0. No final da repetição escreva "EXPLOSÃO".

fun main(){

    var contador = 30

    while (contador >= 0){
        println ("Detonação em: $contador\n")

        contador = contador - 1
    }
    println("EXPLOSÃO!!!!!\n")

}