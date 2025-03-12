//Hora de Codar Dois!!! Exercico 11
//Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma
//das seguintes operações a serem executadas (codificada da seguinte forma: 1.
//Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
//O programa deve calcular e escrever o resultado dessa operação sobre os dois
//valores lidos.
//Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações

fun main(){

    var resultado : Double
    var valorUm : Double
    var valorDois : Double

    print("Escolha um número de 1 a 4 para realizar a operação: \n" +
        "\n 1 - Adição" +
        "\n 2 - Subtração" +
        "\n 3 - Divisão" +
        "\n 4 - Multiplicação \n")
    var numero = readln().toInt()

    when(numero){
        1->{
             // Adição
             println("Digite o primeiro valor: ")
             valorUm = readln().toDouble()
             println("Digite o segundo valor: ")
             valorDois = readln().toDouble()

             resultado = valorDois + valorUm

             println("O resultado da soma é: $resultado")
        }
        2->{
            // Subtração
            println("Digite o primeiro valor: ")
            valorUm = readln().toDouble()
            println("Digite o segundo valor: ")
            valorDois = readln().toDouble()

            resultado = valorUm - valorDois

            println("O resultado da subtração é: $resultado")
        }
        3->{
            // Divisão
            println("Digite o primeiro valor: ")
            valorUm = readln().toDouble()
            println("Digite o segundo valor: ")
            valorDois = readln().toDouble()

            if (valorDois == 0.0) {
                println("Opa!!! Divisão por zero não é permitida!")
            } else {
                resultado = valorUm / valorDois
                println("O resultado da divisão é: $resultado")
            }
        }
        4->{
            // Multiplicação
            println("Digite o primeiro valor: ")
            valorUm = readln().toDouble()
            println("Digite o segundo valor: ")
            valorDois = readln().toDouble()

            resultado = valorUm * valorDois

            println("O resultado da multiplicação é: $resultado")

        }
        else->{
            println("Opa! Número inválido! Escolha um número entre 1 e 4.")
        }

    }

}