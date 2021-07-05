package curso.collections.kotlin

fun main() {

    val salarios = doubleArrayOf(1000.00, 2500.0, 1500.0)

    for (salario in salarios) {
        println(salario)
    }

    println("\n------Maior número-----")
    println("Maior sálario:  ${salarios.maxOrNull()}")
    println("Menor sálario: ${salarios.minOrNull()}")
    println("Média dos sálarios: ${salarios.average()}")


    println("\n------Sálario filtrado-----")
    val salariosFilter = salarios.filter { it > 1000.0 }
    salariosFilter.forEach { println(it) }

    println("\n------Sálario Contagem(range)-----")
    println(salarios.count { it in 2000.0 .. 5000.0 })

    println("\n------Sálario Pesquisa-----")
    println(salarios.find { it == 1500.0 })
    println(salarios.find { it == 5000.0 })

    println("\n------Sálario Pesquisa(Se o valor existe)-----")
    println(salarios.any { it == 1000.0 })
    println(salarios.any{ it == 500.0})

}