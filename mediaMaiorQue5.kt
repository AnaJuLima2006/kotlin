//Hora de Codar Dois!!! Exercício 8
//Escreva um programa que calcule a média de quatro números informados pelo usuário,
//mas somente se esses números forem maiores que 0 e menores que 10. No final, se a
//média for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
//Em qualquer outra situação, ele receberá uma mensagem de "tente novamente".
fun main(){

    var soma  : Double
    var media  : Double

    print("Digite o primeiro número: ")
    var numeroUm = readln().toDouble()
    print("Digite o segundo número: ")
    var numeroDois = readln().toDouble()
    print("Digite o terceiro número: ")
    var numeroTres = readln().toDouble()
    print("Digite o quarto número: ")
    var numeroQuatro = readln().toDouble()


    if ((numeroUm > 0 && numeroUm < 10) && (numeroDois > 0 && numeroDois < 10)
        && (numeroTres > 0 && numeroTres < 10) && (numeroQuatro > 0 && numeroQuatro
                < 10) ){
        soma = numeroUm + numeroDois + numeroTres + numeroQuatro
        media = soma/4
        if(media > 5){
            println("Você passou no teste! ")
        }else{
            println("Tente novamente! Sua média está muito baixa : $media ")
        }
    }else{
        println("Tente novamente!")
    }

}