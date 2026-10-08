package game

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
    println("Sim ou Não")
    val resposta_tutorial = readln()
    var fechando_tutorial = resposta_tutorial.equals("sim", ignoreCase = true)
    if (fechando_tutorial == true) {
        println("Fechando tutorial..")
    } else {
        return tutorial_checagem()
    }
}