package curso.collections.kotlin.list

import Funcionario

fun main() {

    val func = Funcionario("Gerald", 2500.0, "CLT")
    val func1 = Funcionario("Slick", 1500.0,"PJ")
    val func2 = Funcionario("Ricky", 3500.0,"PJ")

    val funcionarios = listOf(func, func1, func2)

    funcionarios.forEach { println(it) }

    println("\n------Pesquisa------")
    println(funcionarios.find { it.nome == "Ricky" })

    println("\n------Ordenação por sálario------")
    funcionarios.sortedBy { it.salarios }.forEach { println(it) }

    println("\n------Organizando por Tipo de contratação------")
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it) }

}
