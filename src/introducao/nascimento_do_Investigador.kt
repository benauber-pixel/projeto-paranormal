package introducao
    fun nascimento_do_Investigador(): String {

        println(
            "Um Quarto em escuridão...Você acorda no breu"
        )
        println("Você não se lembra de nada, parece que você acordou de uma ressaca")
        println("Você pega algo que parece um cartão de plástico do chão")
        println("É um RG, será que pode ser o seu rg?")
        println("Você olha o rg jogado no chão, o pega do chão e percebe que é você nele")
        println("O nome escrito no documento é...")
        var nome_investigador = readlnOrNull()
        if (nome_investigador.isNullOrBlank()) {
            nome_investigador = "Estranho"
            println("Você não consegue enxergar o seu nome. Tá muito escuro pra ver qualquer coisa!")
        } else {
            println("$nome_investigador...Esse definitivamente é um nome que se encaixa com você.")
        }
        println("Explorando um pouco mais a fundo na escuridão. Você encontra uma revista de casos paranormais.")
        println("Junto com um Leitor EMF e um Termomêtro.")
        println("Ler a Revista? Sim ou Não")
        val resposta = readln()
        val lerRevista: Boolean = resposta.equals("sim", ignoreCase = true)
        if (lerRevista == true) {
            println("$nome_investigador decidi ler a revista")
            println("Lendo...")
            println("$nome_investigador descobre que é um tipo de caça fantasma da região com um canal no youtube")
        } else {
            println("$nome_investigador decidi jogar fora a revista e ficar com o Leitor e o Termomêtro.")
        }
        return nome_investigador
    }
        fun sair_do_ninho(nome_investigador: String) {
            println("$nome_investigador continua explorando.")
            println("Sentindo pelo tato, dá pra perceber que é comodo.")
            println("$nome_investigador sente uma porta, um armário e uma vasilha")
            println("Parece que você ficou desacordado dentro de um quarto ou uma sala.")
            println("O que $nome_investigador quer fazer?")
        }

    fun explorar_ninho(nome_investigador: String, armarioexplorado: Boolean, vasilhaexplorado: Boolean) {
        println("---Ações!---")
        println("1. Abrir a porta")

        if (armarioexplorado == false) {
            println("2. Vasculhar o armário")
        }
        if (vasilhaexplorado == false) {
            println("3. Xeretar a vasilha")
        }

        val escolha = readln()

        if (escolha == "1") {
            println("$nome_investigador decide abrir a porta, um clarão te cega por um instante.")


        } else if (escolha == "2" && armarioexplorado == false) {
            println("$nome_investigador vasculha o armário. Dentro do armário tem camisas, calças...")
            return explorar_ninho(nome_investigador, true, vasilhaexplorado)

        } else if (escolha == "3" && vasilhaexplorado == false) {
            println("Dentro da vasilha tinha restos de comida podre. Agora sua mão tá suja.")
            return explorar_ninho(nome_investigador, armarioexplorado, true)

        } else {
            println("Ação Inválida. Tente escolher uma das opções disponíveis.")
            return explorar_ninho(nome_investigador, armarioexplorado, vasilhaexplorado)
        }
    }




