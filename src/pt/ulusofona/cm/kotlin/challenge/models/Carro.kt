package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import java.text.SimpleDateFormat

class Carro(identificador: String, val motor: Motor) : Veiculo(identificador), Ligavel {
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
        if (estaLigado()) {
            posicao.alterarPosicaoPara(x, y)
            desligar()
        } else {
            ligar()
            posicao.alterarPosicaoPara(x, y)
            desligar()
        }
    }

    fun dataFormato(): String {
        val formato = SimpleDateFormat("dd-MM-yyyy")
        return formato.format(dataDeAquisicao)
    }

    override fun requerCarta(): Boolean {
        return true
    }

    override fun toString(): String {
        val formato = SimpleDateFormat("dd-MM-yyyy")
        return "Carro | $identificador | ${formato.format(dataDeAquisicao)} | $posicao"
    }

}