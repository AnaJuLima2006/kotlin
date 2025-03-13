//Hora de Codar Três, exercício Três
//Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive)
//em ordem decrescente.
//Exemplo: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

fun main(){

    var contador = 10

    while (contador > 0) {
        print(contador)

        if (contador > 1) {
            print(", ")
        }

        contador = contador - 1
    }

}