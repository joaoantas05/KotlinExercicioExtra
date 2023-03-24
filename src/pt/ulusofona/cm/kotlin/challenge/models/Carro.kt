package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import java.text.SimpleDateFormat

class Carro(identificador: String, val motor: Motor) : Veiculo(identificador) , Ligavel {
    //var ligado : Boolean = false

    override fun ligar() {
        motor.ligar()
    }

    override fun desligar() {
        motor.desligar()
    }

    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun moverPara(x: Int, y: Int) {
        posicao!!.alterarPosicaoPara(x, y)
    }

    private fun dataFormatada(): String {
        val formato = SimpleDateFormat("dd-MM-yyyy")
        val data = formato.format(dataDeAquisicao)
        return data.toString()
    }

    override fun requerCarta(): Boolean {
        return true
    }

    override fun toString(): String {
        return "Carro | $identificador | ${dataFormatada()} | $posicao"
    }
}