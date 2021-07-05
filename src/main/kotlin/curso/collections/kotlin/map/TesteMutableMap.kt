package curso.collections.kotlin.map

import Funcionario
import Repositorio

fun main() {
    val func = Funcionario("Gerald", 2500.0, "CLT")
    val func1 = Funcionario("Slick", 1500.0,"PJ")
    val func2 = Funcionario("Ricky", 3500.0,"PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(func.nome, func)
    repositorio.create(func1.nome, func1)
    repositorio.create(func2.nome, func2)

    println(repositorio.findById(func1.nome))

    println("\n------ Find all (método) ------")
    repositorio.findAll().forEach { println(it) }

    println("\n------ Excluir um elemento (método) ------")
    repositorio.remove(func.nome)
    repositorio.findAll().forEach { println(it) }

}