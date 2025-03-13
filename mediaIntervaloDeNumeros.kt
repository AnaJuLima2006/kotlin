//Hora de Codar Três, Exercício Cinco!!
//Faça um algoritmo que calcule e escreva a mídia aritmética dos dois números inteiros
//informados pelo usuário e todos os números inteiros entre eles. Considere que o
//primeiro sempre será menor que o segundo.

fun main(){
    var media : Double
    var primeiro: Int
    var ultimo: Int

    do{
        println("Digite o primeiro número: ")
        primeiro = readln().toInt()
        println("Digite o segundo número: ")
        ultimo = readln().toInt()

        if (primeiro >= ultimo) {
            println("Erro: O primeiro número deve ser menor que o segundo. Tente novamente.")
        }
    }while(primeiro >= ultimo) // repete o programa até que numeroUm seja menor que numeroDois

    var soma = 0
    var qtde = 0

    for (numero in primeiro..ultimo) {
        soma += numero
        qtde++
    }

    media = soma.toDouble() / qtde

    println("A média aritmética dos números entre $primeiro,  e $ultimo,  é: $media")

}