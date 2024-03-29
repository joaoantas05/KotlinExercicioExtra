package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open class Veiculo(val identificador: String) : Movimentavel {
    var posicao: Posicao = Posicao(0, 0)
    var dataDeAquisicao: Date = Date()

    open fun requerCarta(): Boolean {
        return false
    }

    fun setDataDeAquisicao() {
        dataDeAquisicao = Date()
    }

    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }
}
