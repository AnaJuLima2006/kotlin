//Hora de Codar Dois!!! Exercício 2
//Faça um programa que leia um valor informado pelo usuário e
//diga se o valor informado é positivo, negativo ou zero.
fun main(){

    print("Digite um número, e eu te direi se ele é positivo, negativo ou zero: ")
    var numero = readln().toInt()
    
    if(numero > 0){
        print("O número é: positivo!")
    }else if(numero < 0){
        print("O número é: negativo!")
    }else{
        println("O número é igual a zero!")
    }
}