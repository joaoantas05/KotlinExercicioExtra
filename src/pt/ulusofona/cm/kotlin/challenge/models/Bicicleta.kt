package pt.ulusofona.cm.kotlin.challenge.models

import java.text.SimpleDateFormat

class Bicicleta(identificador: String) : Veiculo(identificador) {
    override fun requerCarta(): Boolean {
        return false
    }

    private fun dataFormatada(): String {
        val dataFormato = SimpleDateFormat("dd-MM-yyyy")
        val data = dataFormato.format(dataDeAquisicao)
        return data.toString()
    }

    override fun toString(): String {
        return "Bicicleta | $identificador | ${dataFormatada()} | $posicao"
    }
}