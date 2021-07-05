package curso.collections.kotlin

fun main() {
    val values = intArrayOf(2, 3, 7, 4, 6, 9)

    values.forEach {
        println(it)
    }

    println("------Em ordem------")
    values.sort()
    values.forEach {
        print(it)
    }

}