fun main  (){
    //Hora de Codar Um!!! exercico 4
    //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba
    //em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada
    //variável.

    var  area : Double
    var base : Double
    var altura : Double
    var lado : Double
    var diagonalMaior : Double
    var diagonalMenor : Double
    var baseMaior : Double
    var baseMenor : Double
    var raio : Double
    var pi = 3.14

    print("Escolha um numero de 1 a 6 e calcule a area da figura...\n" +
            "1 - Retângulo\n" +
            "2 - Quadrado\n" +
            "3 - Losango\n" +
            "4 - Trapézio\n" +
            "5 - Parelogramo\n" +
            "6 - Triângulo\n" +
            "7 - Círculo\n")

    var opcao = readln().toInt()

    when(opcao) {
        1 -> {
            println("Digite a base do retângulo: ")
            base = readln().toDouble()
            println("Digite a altura do retângulo: ")
            altura = readln().toDouble()
            area = base * altura
            println("A área do retângulo é  $area")
        }

        2 -> {
            println("Digite o lado do quadrado: ")
            lado = readln().toDouble()

            area = lado * lado
            println("A área do quadrado é  $area")
        }

        3 -> {
            println("Digite a diagonal maior do losango: ")
            diagonalMaior = readln().toDouble()
            println("Digite a diagonal menor do losango: ")
            diagonalMenor = readln().toDouble()

            area = (diagonalMaior * diagonalMenor) / 2
            println("A área do losango é  $area")
        }

        4 -> {
            println("Digite a base maior do trapézio: ")
            baseMaior = readln().toDouble()
            println("Digite a base menor do trapézio: ")
            baseMenor = readln().toDouble()
            println("Digite a altura do trapézio: ")
            altura = readln().toDouble()

            area = (baseMaior + baseMenor) * altura / 2
            println("A área do trapézio é  $area")
        }

        5 -> {
            println("Digite a base do parelogramo: ")
            base = readln().toDouble()
            println("Digite a altura do parelogramo: ")
            altura = readln().toDouble()

            area = base * altura
            println("A área do parelogramo é  $area")
        }
        6 -> {
            println("Digite a base do triângulo: ")
            base = readln().toDouble()
            println("Digite a altura do triângulo: ")
            altura = readln().toDouble()

            area = (base * altura) / 2
            println("A área do triângulo é  $area")
        }

        7 -> {
            println("Digite o raio do círculo : ")
            raio = readln().toDouble()

            area = pi * (raio * raio)
            println("A área do círculo é  $area")
        }

        else -> {

        }

    }

}