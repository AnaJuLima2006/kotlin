//Hora de Codar Dois!!! Exercicio 5
//Faça um programa que leia 6 valores informados pelo usuário, calcule,
//exiba os números informados e escreva a média aritmética desses valores lidos.
fun main(){

    var media: Double
    var soma : Double

    print("Digite o primeiro número: ")
    var numeroUm = readln().toDouble()
    print("Digite o segundo número: ")
    var numeroDois = readln().toDouble()
    print("Digite o terceiro número: ")
    var numeroTres = readln().toDouble()
    print("Digite o quarto número: ")
    var numeroQuatro = readln().toDouble()
    print("Digite o quinto número: ")
    var numeroCinco = readln().toDouble()
    print("Digite o sexto número: ")
    var numeroSeis = readln().toDouble()

    soma = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco + numeroSeis
    media = soma/6

    println("A média aritmédica entre os seis números é:  $media")
}
