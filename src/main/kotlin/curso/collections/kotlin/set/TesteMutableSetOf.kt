package curso.collections.kotlin.set

import Funcionario

fun main() {
    val func = Funcionario("Gerald", 2500.0, "CLT")
    val func1 = Funcionario("Slick", 1500.0,"PJ")
    val func2 = Funcionario("Ricky", 3500.0,"PJ")

    val funcionarioSetOf = mutableSetOf(func)
    funcionarioSetOf.forEach { println(it) }

    println("\n------ Adicionando um elemento ------")
    funcionarioSetOf.add(func1)
    funcionarioSetOf.add(func2)
    funcionarioSetOf.forEach { println(it) }

    println("\n------ Removendo um elemento ------")
    funcionarioSetOf.remove(func)
    funcionarioSetOf.forEach { println(it) }

}