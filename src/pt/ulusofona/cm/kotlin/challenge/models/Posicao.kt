package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

class Posicao(var x: Int, var y: Int) {
    fun alterarPosicaoPara(x: Int, y: Int) {
        if(this.x != x || this.y != y){
            this.x = x
            this.y = y
        } else {
            throw AlterarPosicaoException()
        }
    }

    override fun toString(): String {
        return "Posicao | x:$x | y:$y"
    }
}