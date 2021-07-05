package curso.collections.kotlin

fun main() {
    val nomes = Array(4){" "}

    nomes[0] = "Gerald"
    nomes[1] = "Gecko"
    nomes[2] = "Kayn"
    nomes[3] = "Obito"

    for (nome in nomes){
        println(nome)
    }

    println("------Em ordem------")
    nomes.forEach { println(it) }

    println("-----Em ordem (Nova instância)------")
    val newNames = arrayOf("Link", "Cloud", "Ash", "Noctis")
    newNames.sort()
    newNames.forEach { println(it) }

}