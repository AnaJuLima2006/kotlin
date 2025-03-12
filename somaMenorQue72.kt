//Hora de Codar Dois!!! Exercicio 7
//Faça um programa que leia 6 números que o usuário vai informar. Todos os números
//lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma
//efetuada e também todos valores que o usuário informou.
fun main(){

    var soma  = 0

    print("Digite o primeiro número: ")
    var numeroUm = readln().toInt()
    print("Digite o segundo número: ")
    var numeroDois = readln().toInt()
    print("Digite o terceiro número: ")
    var numeroTres = readln().toInt()
    print("Digite o quarto número: ")
    var numeroQuatro = readln().toInt()
    print("Digite o quinto número: ")
    var numeroCinco = readln().toInt()
    print("Digite o sexto número: ")
    var numeroSeis = readln().toInt()

    if (numeroUm < 72){
        soma = soma + numeroUm
    }

    if (numeroDois < 72){
        soma = soma + numeroDois
    }

    if (numeroTres < 72){
        soma = soma + numeroTres
    }

    if (numeroQuatro < 72){
        soma = soma + numeroQuatro
    }

    if (numeroCinco< 72){
        soma = soma + numeroCinco
    }

    if (numeroSeis < 72){
        soma = soma + numeroSeis
    }

    println("O resultado da soma é:   $soma")
    println("Os valores lidos foram:  $numeroUm, $numeroDois, $numeroTres, " +
            "$numeroQuatro, $numeroCinco, $numeroSeis.")

}