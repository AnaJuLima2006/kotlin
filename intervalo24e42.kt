//Hora de Codar Três, Exercício Dez!!
//Escreva um programa em que o usuário informe 10 valores e escreva quantos esses
//valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e
//quantos deles estão fora deste intervalo.

fun main(){
    var numero : Int
    var dentroIntervalo = 0
    var foraIntervalo = 0

    println("Digite 10 números: ")

    for (i in 1..10) {
        print("Número $i : ")
        numero = readln().toInt()
        if (numero >= 24 && numero <= 42) {
            dentroIntervalo = dentroIntervalo + 1
        } else {
            foraIntervalo = foraIntervalo + 1
        }
    }

    println("\nQuantidade de valores dentro do intervalo (24, 42): $dentroIntervalo")
    println("\nQuantidade de valores fora do intervalo (24, 42): $foraIntervalo")
}