//Hora de Codar Três, Exercício Seis!!
//Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
//Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a
//média de outro aluno Sim/Não?" e peço uma resposta. Se a resposta for "S", o
//programa deve ser executado novamente, caso contrário, deve ser encerrado exibindo
//a quantidade de alunos aprovados.


fun main(){
    var media : Double
    var notaUm : Double
    var notaDois : Double
    var resposta : String
    var aprovados = 0


    do{
        println("Digite a primeira nota: ")
        notaUm = readln().toDouble()
        println("Digite o segunda nota: ")
        notaDois = readln().toDouble()

        media = (notaUm + notaDois) / 2

        if(media >= 9.5 ){
            println("Sua média é: $media você foi aprovado!\n")
            aprovados = aprovados + 1
        }else{
            println("Sua média é: $media, você foi reprovado!\n")
        }

        println("Deseja calcular a média de outro aluno Sim/Não?\n")
        resposta = readln()
    }while (resposta == "s")

    println("O total de aprovados é: $aprovados")

}