package curso.collections.kotlin

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 6
    values[2] = 8
    values[3] = 3
    values[4] = 7

    for(valor in values) {
        println(valor)
    }

    println("------------")

    values.forEach {
        println(it)
    }

    println("------------")

    for(index in values.indices){
        println(values[index])
    }

    println("------Em ordem------")
    values.sort()
    for(valor in values) {
        println(valor)
    }

}