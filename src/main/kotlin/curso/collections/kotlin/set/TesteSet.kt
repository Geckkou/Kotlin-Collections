package curso.collections.kotlin.set

import Funcionario

fun main() {
    val func = Funcionario("Gerald", 2500.0, "CLT")
    val func1 = Funcionario("Slick", 1500.0,"PJ")
    val func2 = Funcionario("Ricky", 3500.0,"PJ")

    val funcionario = setOf(func, func1)
    val funcionario2 = setOf(func2)

    val resultUnion = funcionario.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("\n------Subtraindo funcionarios------")
    val funcionario3 = setOf(func, func1, func2)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("\n------O que tem de comum entre os funcionarios------")
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }


}