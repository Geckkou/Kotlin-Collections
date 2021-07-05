package curso.collections.kotlin

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 24577.6
    salarios[1] = 33489.65
    salarios[2] = 54645.6

    salarios.forEach {
        println(it)
    }

    println("-----------")

    salarios.forEachIndexed{
        index, salario -> salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("-----------")

    val salario2 = doubleArrayOf(1000.00, 2500.0, 1500.0)
    salario2.sort()
    salario2.forEach {
        println(it)
    }
}