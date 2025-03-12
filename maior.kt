//Hora de codar Dois!!! Exercicio 1
//Escreva um programa em que o usuário informe dois números. Então escreva em
//tela o maior deles.
fun main(){

    print("Digite o primeiro número: ")
    var numeroUm = readln().toInt()
    print("Digite o segundo número: ")
    var numeroDois = readln().toInt()

    if(numeroUm < numeroDois){
        print("O maior número é: $numeroDois")
    }else if(numeroUm > numeroDois){
        print("O maior número é: $numeroUm")
    }else{
        println("Os números são iguais!")
    }
}