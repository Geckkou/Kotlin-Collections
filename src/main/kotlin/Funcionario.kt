data class Funcionario(
    val nome:String,
    val salarios: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Sálario: $salarios
            Tipo: $tipoContratacao
            -------------------
        """.trimIndent()
}