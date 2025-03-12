//Hora de codar Dois!!! Exercicio 3
//Faça um programa para ler 3 valores (considere que não serão informados valores iguais)
//e escrever o maior deles.
fun main(){

    print("Digite o primeiro número: ")
    var numeroUm = readln().toInt()
    print("Digite o segundo número: ")
    var numeroDois = readln().toInt()
    print("Digite o terceiro número: ")
    var numeroTres = readln().toInt()

    if(numeroUm > numeroDois && numeroUm > numeroTres){
        print("O maior número é: $numeroUm")
    }else if(numeroDois > numeroTres && numeroDois > numeroUm){
        print("O maior número é: $numeroDois")
    }else{
        println("O maior número é: $numeroTres")
    }
}