//Hora de Codar Dois!!! Exercicio 9
//Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
//mensagem que diga se ela poderá ou não votar este ano (não é necessário
//considerar o mês em que ela nasceu).
fun main(){

    var anoAtual = 2025
    var idade : Int

    print("Digite o seu ano de nascimento:")
    var ano = readln().toInt()

    idade = anoAtual - ano
    if (idade >= 16) {
        println("Você pode votar!")
    }else{
        println("Você não pode votar!")
    }

}