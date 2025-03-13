//Hora de Codar Três, exercício Um
//Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor
//informado for igual ou menor que ZERO, deve ser lido um novo valor. Ou seja, para o
//segundo valor não pode ser aceito o valor zero, nem um valor negativo.
//O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo
//valor e exibir o resultado ao usuário.

fun main(){

    var resultado : Double
    var valorUm : Double
    var valorDois : Double


     println("Digite o primeiro número: ")
     valorUm = readln().toDouble()
     println("Digite o segundo número: ")
     valorDois = readln().toDouble()



    if(valorDois <= 0){
        println("Digite o segundo número novamente: ")
        valorDois = readln().toDouble()

        resultado = valorUm/valorDois
        println("O resultado da divisão é: $resultado")
    }else{
        resultado = valorUm/valorDois
        println("O resultado da divisão é: $resultado")
    }

}