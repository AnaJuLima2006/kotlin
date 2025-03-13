//Hora de Codar Quatro! Exercicio um
//Crie um programa onde o usuário possa cadastrar estudantes sem limites,
// e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a
// quantidade de estudantes cadastrados e a lista com cada um deles.
fun main() {
    val estudantes = mutableListOf<String>() //lista estudantes
    var i = 0
    while(true){
        println("Digite o nome do estudante  ${i+1} ° :(Deseja parar? (digite PARE))")
        var nomeEstudante = readln()

        if (nomeEstudante.uppercase() == "PARE") {
            break
        }
        estudantes.add(nomeEstudante)
        i++
    }
    println("\nQuantidade de estudantes cadastrados: $i")

    println("Lista de estudantes:")
    for (estudante in estudantes) {
        println(estudante)
    }
}
