package curso.collections.kotlin.map

fun main() {
    val pair: Pair<String, Double> = Pair("Gecko", 2000.0)
    val mapi = mapOf(pair)

    mapi.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Link" to 3500.0,
        "Shink" to 5000.0
    )

    map2.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }
}