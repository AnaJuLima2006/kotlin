//Hora de Codar Três, Exercício Sete!!
//Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima
//a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a
//leitura (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite previsto,
//deve ser solicitado um novo valor ao usuário.


fun main(){
    var media : Double
    var nota : Double
    var soma = 0.0



    println("Digite suas notas: ")

    for (i in 1.. 6) {
        while(true){
            println("Nota  $i ° :")
            nota = readln().toDouble()

            if(nota >= 0 && nota <= 10){
                soma = soma + nota
                break
            }else{
                println("Valor inválido! Digite novamente.")
            }
        }
    }
    media = soma/6
    println("Sua média é: ${"%.2f".format(media)}")

}