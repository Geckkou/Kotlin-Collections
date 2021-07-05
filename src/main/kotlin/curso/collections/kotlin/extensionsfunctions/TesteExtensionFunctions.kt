package curso.collections.kotlin.extensionsfunctions

import curso.collections.kotlin.media
import curso.collections.kotlin.somatoria

fun main() {
    val salarios = arrayOf("2000".toBigDecimal(),
                           "1500".toBigDecimal(),
                           "4000".toBigDecimal())

    println("------ Somando ------")
    println(salarios.somatoria())

    println("\n------ Fazendo a média ------")
    println(salarios.media())
}