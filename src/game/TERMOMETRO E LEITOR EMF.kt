package game

fun checagem(salas: Int = 2) {

    fun checagem(salas: Int = 2) {
        var campo_magnetico = 0
        var temp = 20

        println("--CHECAGEM DE APARIÇÃO--")
        println("Iniciando varredura do ambiente..")

        for (i in 1..salas) {
            println("Escaneando..$i")
            campo_magnetico += 2
            temp--
        }

        val leitorEMF = campo_magnetico
        val termometro = temp

        if (leitorEMF == 2 && termometro >= 15) {
            println("LeitorEMF: Nível 01 = Sala Normal")
            println("Termômetro: $termometro°C, Temperatura Normal!")
        } else if (leitorEMF == 4 && termometro >= 10) {
            println("LeitorEMF: Nível 02 = Sinal Anormal")
            println("Termômetro: $termometro°C, Queda de Temperatura!")
        } else if (leitorEMF == 6 && termometro >= 5) {
            println("LeitorEMF: Nível 03 = Oscilação Detectada")
            println("Termômetro: $termometro°C, Temperatura Fria!")
        } else if (leitorEMF == 8 && termometro == 0) {
            println("LeitorEMF: Nível 04 = Possível Evento Paranormal em breve")
            println("Termômetro: $termometro°C, Temperatura Congelante!")
        } else {
            println("LeitorEMF: Nível 05 = ALERTA!! EVENTO PARANORMAL!!")
            println("Termômetro: $termometro°C, Temperatura Congelante!")
        }
    }
}