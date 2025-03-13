//Hora de codar Quatro! Exercicio Três
//Vamos criar uma lista de compras.
//Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao
// usuário para digitar o nome de uma das frutas. Caso a fruta esteja
// no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".
//Peça novamente para o usuário digitar o nome de uma fruta para ser
// removida. Sempre que o usuário procurar por uma fruta que não está
// no array exiba a mensagem "Fruta indisponível no nosso mercado".
//Quando o array não possuir mais itens dentro de si, escreva "Lista de
// compras finalizada".
fun main() {
    val compras : MutableList<String> = mutableListOf("Maçã", "Pera", "Kiwi", "Pitaya")
    do {
        println("$compras")
        println("Digite o nome de uma fruta :")
        var fruta = readln()

        if (fruta in compras) {
            compras.remove(fruta)
            println("$fruta removida da lista!")
        }else{
            println("$fruta indisponivel na lista!")
        }
    }while (compras.isNotEmpty())
    println("Lista de compras  finalizada!")


}
