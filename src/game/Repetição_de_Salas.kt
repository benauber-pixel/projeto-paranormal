package game

fun rep_salas(nome_investigador: String, salaAtual: Int = 3, tempInicial: Int = 12) {
    fun rep_salas(nome_investigador: String, salaAtual: Int = 1, tempInicial: Int = 15) {
        var sala = salaAtual
        var temp = tempInicial
        var jogando = true

        while (jogando) {
            println("==============================")
            println("=== VOCÊ ESTÁ NA SALA $sala ===")
            println("==============================")
            println("1. CHECAR AMBIENTE (EMF / Termómetro / Fantasma)")
            println("2. IR PARA A PRÓXIMA SALA")
            println("3. SE ESCONDER NO ARMÁRIO")
            print("Escolha uma ação: ")

            val escolha = readlnOrNull()

            when (escolha) {
                "1" -> {
                    checagem(salas = sala)
                }
                "2" -> {
                    println("$nome_investigador avançou para a próxima porta...")
                    sala++
                    temp -= 5
                }
                "3" -> {
                    println("nome_investigador corre em pânico e tranca-se no armário...")
                    println("O tempo passa... minutos, horas no escuro total.")
                    println("De repente, acordas assustado na tua cama!")
                    println("Percebes que adormeceste na mansão e tudo não passou de um sonho paranormal!")
                    println("=== FIM DE JOGO ===")

                    jogando = false
                }
                else -> println("Opção inválida! Escolha 1, 2 ou 3.")
            }
        }
    }

}