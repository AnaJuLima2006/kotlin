//Hora de Codar Quatro! Exercicio Dois
//Crie uma array de planetas que inclua "Terra", "Marte", "Plutão",
//"Vênus", "Júpiter", "Saturno"  e, em seguida, peça ao usuário para
// digitar o nome de um planeta.Verifique se o planeta que o usuário
// informou está na array e informe ao usuário.
fun main() {
    val planetas : MutableList<String> = mutableListOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno" ) //lista planetas

    println("Digite o nome de planeta  ° :")
    var planeta = readln()

    if (planeta in planetas) {
        println("$planeta já consta na lista!")
    }else{
        println("$planeta não consta na lista!")
    }

    println("Lista de planetas:")
    for (planeta in planetas) {
        println(planeta)
    }
}
