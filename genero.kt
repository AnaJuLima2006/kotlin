//Hora de Codar Dois!!! Exercício 10
//Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte
//forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que
//calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.
fun main(){

    var peso : Double

    print("Digite a sua altura (em metros): ")
    var altura = readln().toDouble()
    print("Digite o gênero que você foi designado ao nascer " +
            "(codificado da seguinte forma: 1-  feminino e 2 - masculino: ")
    var genero = readln().toInt()

    if (genero == 1) {
        peso = (62.1 * altura) - 44.7
        println("Seu peso ideal é: $peso")
    }else{
        peso = (72.2 * altura) - 58
        println("Seu peso ideal é: $peso")
    }

}