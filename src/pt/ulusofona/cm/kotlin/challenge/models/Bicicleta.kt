package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.text.SimpleDateFormat

class Bicicleta(identificador: String) : Veiculo(identificador) {
    override fun requerCarta(): Boolean {
        return false
    }

    private fun dataFormatada(): String {
        val formato = SimpleDateFormat("dd-MM-yyyy")
        val data = formato.format(dataDeAquisicao)
        return data.toString()
    }

    override fun toString(): String {
        return "Bicicleta | $identificador | ${dataFormatada()}| $posicao"
    }
}