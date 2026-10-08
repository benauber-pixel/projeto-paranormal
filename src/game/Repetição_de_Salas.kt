package game

    fun rep_salas(nome_investigador: String, salaAtual: Int = 1, tempInicial: Int = 15, Nivel_Leitor: Int = 1) {
        var sala = salaAtual
        var temp = tempInicial
        var nivelLeitor = Nivel_Leitor
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
                    println("=== ANALISANDO O AMBIENTE DA SALA $sala ===")
                    checagem(salas = sala)
                   identificar_fantasma(temperatura = temp, energia = Nivel_Leitor)
                    println("-----------------------------------------------")
                    println("Temperatura: $temp || Nível EMF: $Nivel_Leitor")
                }
                "2" -> {
                    println("$nome_investigador avançou para a próxima porta...")
                    sala++
                    temp -= 5
                    nivelLeitor += 2
                    println("$nome_investigador atravessou a porta e entrou na SALA $sala!")
                    println("Você sente um arrepio imediato...A temperatura caiu para $temp°C!")
                    if (Nivel_Leitor >= 5) {
                        println("O Leitor EMF começou a apitar mais rápido!(Nível $Nivel_Leitor)")
                    }
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

