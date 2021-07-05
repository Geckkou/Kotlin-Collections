package curso.collections.kotlin.map

import Funcionario

fun main() {
    val func = Funcionario("Gerald", 2500.0, "CLT")
    val func1 = Funcionario("Slick", 1500.0,"PJ")
    val func2 = Funcionario("Ricky", 3500.0,"PJ")

    val funcionarios = mutableListOf(func, func1)
    funcionarios.forEach { println(it) }

    println("\n------Adicionando um novo elemento------")
    funcionarios.add(func2)
    funcionarios.forEach { println(it) }

    println("\n------Removendo um elemento------")
    funcionarios.remove(func)
    funcionarios.forEach { println(it) }


}