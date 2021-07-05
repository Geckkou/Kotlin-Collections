package curso.collections.kotlin

import java.math.BigDecimal

//são funções que extende o que já existe, ou seja, adiona funções a uma classe ou interface já pronta(Por exemplo)
//No caso o do BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()