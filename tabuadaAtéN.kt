//Hora de Codar Três, Exercício Dez!!
//Escreva um programa para imprimir todas as tabuadas de 1 a N.
//N será informado pelo usuário.

fun main(){
    var n : Int

    println("Digite um número: ")
    n = readln().toInt()

    for (i in 1 .. n ) {
        println("\nTabuada do $i:\n ")
        for (j in 0..10) {
            println("$i  X  $j  = ${i * j}\n")
        }
    }
}