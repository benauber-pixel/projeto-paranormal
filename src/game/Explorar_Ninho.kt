package game

fun explorar_ninho(nome_investigador: String, armarioexplorado: Boolean, vasilhaexplorado: Boolean) {

    println("---{AÇÕES!}---")
    println("1. Abrir a porta")

    if (armarioexplorado == false) {
        println("2. Vasculhar o armário")
    }
    if (vasilhaexplorado == false) {
        println("3. Xeretar a vasilha")
    }

    val escolha = readlnOrNull()

    if (escolha == "1") {
        println("$nome_investigador decide abrir a porta, um breu semelhante ao desta sela te espera.")

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


    println("--SALA 01--")
    var salas: Int = 1
    println("$nome_investigador entrou em uma nova sala pela porta")
    println("Não parece ser tão diferente da sala anterior, na verdade é igual a anterior.")
    println("$nome_investigador se questiona se ele está dentro de algum loop temporal dentro desta mansão")
    print("ou algo assim")
    println("Você vê a sua frente outra porta.")
    println("$nome_investigador vai abrir está porta?")

    var resposta_1p = readln()
    var escolha_1p: Boolean? = resposta_1p.equals("sim", ignoreCase = true)

    if (escolha_1p == true) {
        println("--SALA 02--")
        salas++
        println("$nome_investigador a porta para se deparar novamente com a exata sala que estava anteriormente")
        println("Sua teoria foi compravada")
        println("Mas parece que o nome das salas mudam de forma crescente, agora é SALA 02")
        println("Mas parece que agora o seu leitor EMF apitou e o Termomêtro mudou com a troca do ambiente")
        println("$nome_investigador corre em disparada para próxima porta com medo")
        println("A partir de agora $nome_investigador está em estado de Pânico!!!")
    } else {
        println("Você decide ficar para ver se eram os mesmos itens no armário e vasilha")
        println("E..São")
        println("Não tem muito mais o que fazer nesta sala.")
    }

    fun tutorial_checagem() {

        println("--TUTORIAL DE CHECAGEM DE APARIÇÃO--")
        println("A partir de agora você vai usar o Leitor EMF e o Termomêtro")
        println("Ao selecionar a opção CHECAGEM DE APARIÇÃO, você utiliza o Leitor EMF e o Termomêtro")
        println(
            "O Leitor EMF verifica o campo magnetico da sala e " +
                    "retorna em níveis do quão próximo você está de um evento paranormal"
        )
        println("--NÍVEIS DO LEITOR--")
        println(
            "Nível 01 -> É o estado padrão do aparelho logo após ser ligado, " +
                    "indicando um ambiente normal sem nenhuma atividade ou interação no momento."
        )
        println("Nível 02 -> Indica que o fantasma interagiu com a sala que você está.")
        println("Nível 03 -> Indica que o fantasma interagiu recentemente com a sala que você está.")
        println("Nível 04 ->  Indica que o fantasma está proximo de você")
        println("Nível 05 ->  Indica a ocorrência direta de um evento paranormal")
        println("--TERMOMÊTRO--")
        println(
            "O Termomêtro verifica a temperatura da sala. " +
                    "O Termomêtro se atualiza a cada vez que entra em uma nova sala" +
                    " Se ela estiver mais alta é improvável que aconteça uma intervenção paranormal. " +
                    "Mas quanto mais abaixa, mais adequado está a sala para o evento paranormal. "
        )
        println("Fechar Tutorial?")
        println("1 -> Sim ou 2 ->Não")
        val resposta_tutorial = readln()
        var fechando_tutorial = resposta_tutorial.equals("sim", ignoreCase = true)
        if (fechando_tutorial == true) {
            println("Fechando tutorial..")
        }else{
            return tutorial_checagem()
        }
    }


}

