import java.util.*
import kotlin.system.exitProcess

//Hora de Codar 5
var saldo = 150.00
var nome : String = ""
var senha = 3589
var extrato = ""

fun main(){
    println("Digite o seu nome:")
    nome = readln().trim()
    verNome()
    login()
}

fun caixa() {

    var  opcao : Int

    println("Escolha uma opção:\n")
    println("1. Ver Saldo")
    println("2. Ver Extrato")
    println("3. Fazer Saque")
    println("4. Fazer Deposito")
    println("5. Fazer Transferencia")
    println("6. Sair do Programa")
    opcao = readln().trim().toInt()

    println("A opção selecionada foi: " + opcao + "\n")
    when(opcao){
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair()
        else -> erro()
    }

}

fun verNome(){
    println("Olá $nome, é um prazer ter você por aqui!\n")
}

fun login(){
    println("Digite a senha:\n")
    senha = readln().trim().toInt()
    if(senha == 3589){
        caixa()
    }else{
        println("Senha incorreta, tente novamente!!!\n")
        login()
    }

}
fun verSaldo(){
    println("Seu saldo atual é: $saldo\n")
    caixa()
}

fun verExtrato(){
    println("Seu extrato de transações é:\n")
    if (extrato == "") {
        println("Nenhuma transação registrada até o momento.\n")
    } else {
        println(extrato)
    }
    caixa()
}

fun fazerDeposito() {

    println("Qual o valor para depósito? ")
    var deposito = readln().trim().toDouble()

    if (deposito <= 0){
        println("Operação não autorizada! Por favor, informe um número válido.\n")
        fazerDeposito()
    } else {
        saldo = saldo + deposito
        extrato = extrato + "Depósito de R$ " + deposito + " realizado.\n"
        verSaldo()
    }
}

fun fazerSaque(){

    println("Qual o valor para saque? ")
    var saque = readln().trim().toDouble()

    if (saque <= 0) {
        println("Operação não autorizada! Por favor, informe um número válido.\n")
        fazerSaque()
    } else if (saque > saldo) {
        println("Saldo insuficiente!\n")
        verSaldo()
    } else {
        saldo = saldo - saque
        extrato = extrato + "Saque de R$ " + saque + " realizado.\n"
        verSaldo()
    }

}

fun fazerTransferencia() {
    var conta: Int
    var transferencia: Double

    while (true) {
        println("Qual o número da conta? ")
        conta = readln().trim().toIntOrNull() ?: -1 // Se não for número, retorna -1

        if (conta > 0) {
            break
        } else {
            println("Número inválido! Digite apenas números positivos.\n")
        }
    }

    while (true) {
        println("Qual o valor da transferência? ")
        transferencia = readln().trim().toDoubleOrNull() ?: -1.0

        when {
            transferencia <= 0 -> println("Valor inválido! Digite um número maior que zero.\n")
            transferencia > saldo -> println("Saldo insuficiente!\n")
            else -> break
        }
    }

    saldo = saldo - transferencia
    extrato = extrato + "Transferência de R$ $transferencia realizada para a conta $conta.\n"
    verSaldo()
}

fun erro() {
    println("Opção Inválida!!! Escolha um número de 1 a 6\n")
    caixa()
}

fun sair() {
    while (true) {
        println("Você deseja sair? (S/N)")
        val resposta = readln().trim().uppercase()

        when (resposta) {
            "S" -> {
                println("$nome, foi um prazer ter você por aqui!")
                exitProcess(0)
            }
            "N" -> {
                caixa()
                break
            }
            else -> println("Opção inválida! Digite apenas 'S' ou 'N'.")
        }
    }
}



