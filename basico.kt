// Conceitos Básicos de Kotlin
    // Declaração de variáveis
    print("Declaração de variáveis")
    var nome = "João"
    var idade = 25
 
    val outro_nome = "Maria" // val é uma variável imutável
 
    // readLine() é uma função que lê uma linha de texto da entrada padrão (teclado)
    // Regras para usar ReadLine
    // 1. readLine() retorna um tipo de variavel
    // 2. readline() foi substituído por readln(
 
    println("\nDigite a sua idade: ")
    val outra_idade = readln().toInt() // leitura de dados do teclado
 
    println("\nNome: $nome")
    println("\nIdade: $idade")
 
    // Tipos de variáveis
    print("Tipos de variáveis")
    var salario: Double = 1000.0
    var bonus: Float = 200.0f
    var desconto: Int = 10
    var ativo: Boolean = true
    var letra: Char = 'A'
 
    println("Salário: $salario")
    println("Bônus: $bonus")
    println("Desconto: $desconto")
    println("Ativo: $ativo")
    println("Letra: $letra")
 
 
    // Conversão de tipos
    println("Conversão de tipos")
    var numero1: Int = 10
    var numero2: Double = numero1.toDouble()
 
    println("Número 1: $numero1")
    println("Número 2: $numero2")
 
    // Operadores Aritméticos
    println("Operadores Aritméticos")
    var a = 10
    var b = 20
 
    println("Soma: ${a + b}")
    println("Subtração: ${a - b}")
    println("Multiplicação: ${a * b}")
    println("Divisão: ${a / b}")
    println("Resto: ${a % b}")
 
    // Operadores de Atribuição
    println("Operadores de Atribuição")
    var x = 10
    x += 5 // x = x + 5
    println("x = $x")
 
    x -= 5 // x = x - 5
    println("x = $x")
 
    x *= 5 // x = x * 5
    println("x = $x")
 
    x /= 5 // x = x / 5
    println("x = $x")
 
    x %= 5 // x = x % 5
    println("x = $x")
 
    // Operadores de Comparação
    println("Operadores de Comparação")
    var c = 10
    var d = 20
 
    println("c == d: ${c == d}")
    println("c != d: ${c != d}")
    println("c > d: ${c > d}")
    println("c < d: ${c < d}")
    println("c >= d: ${c >= d}")
    println("c <= d: ${c <= d}")
 
    // Operadores Lógicos
    println("Operadores Lógicos")
    var e = true
    var f = false
 
    println("e && f: ${e && f}")
 
    println("e || f: ${e || f}")
 
    println("!e: ${!e}")
 
    println("!f: ${!f}")
 
    // Desvio Condicional
    println("Desvio Condicional")
    var nota = 7
 
    if (nota >= 7) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
 
    // Operadores Unários
    println("Operadores Unários")
    var g = 11
    var h = 20
 
    println("g++: ${g++}")
    println("h--: ${h--}")
    println("++g: ${++g}")
    println("--h: ${--h}")
 
    // Operadores Ternários
    println("Operadores Ternários")
    var i = 10
    var j = 20
 
    var maior = if (i > j) i else j
 
    println("Maior: $maior")
 
    // Operadores In
    println("Operadores In")
    var k = 10
    var l = 1..100
 
    if (k in l) {
        println("k está no intervalo de 1 a 100")
    } else {
        println("k não está no intervalo de 1 a 100")
    }
 
    // Operadores Range ou Laços de Repetição
    println("Operadores Range")
 
    for (m in 1..10) {
        println(m)
    }
 
    for (n in 10 downTo 1) {
        println(n)
    }
 
    for (o in 1 until 10) {
        println(o)
    }
 
    for (p in 1..10 step 2) {
        println(p)
    }
 
    // Arrays ou Vetores
    println("Arrays ou Vetores")
 
    // Regras para declaração de arrays em Kotlin
    // 1. O tipo de dado do array é definido pelo tipo de dado dos elementos
    // 2. O tamanho do array é definido pelo número de elementos
    // 3. O índice do array começa em 0
    // 4. O array é imutável por padrão
    // 5. O array é mutável se for declarado com a palavra-chave var
    // 6. O array é homogêneo, ou seja, todos os elementos devem ser do mesmo tipo
 
    var nomes = arrayOf("João", "Maria", "José")
    var numeros = intArrayOf(1, 2, 3, 4, 5)
 
    println(nomes[0] + " " + nomes[1] + " " + nomes[2] + "\n")
    println(numeros[0])
    println()
 
    // Existem arrays ou lista mutáveis em Kotlin?
 
    // Sim, existem arrays mutáveis em Kotlin. Para criar um array mutável, você pode usar a função mutableListOf().
    // Exemplo:
    var outros_nomes = mutableListOf("João", "Maria", "José")
    outros_nomes.add("Pedro")
    outros_nomes.removeAt(0)
    println(outros_nomes)
