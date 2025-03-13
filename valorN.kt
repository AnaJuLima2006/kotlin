//Hora de Codar Três, Exercício Oito!!
//Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
//Considere que o N será sempre maior que ZERO. N é um valor informado pelo usuário


fun main(){
    var n : Int
    println("Digite um número para N (maior que 0): ")
    n = readln().toInt()

    if (n > 0){
        for (i in 1.. n) {
        if (i > 1) {
            print(", ")
        }
        print ("$i")
    }
    }else{
        println("O valor de N tem que ser maior que 0!!!")
    }


}