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
    println("ou algo assim.")
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
        println("Agora o seu leitor EMF apitou e o Termomêtro mudou com a troca do ambiente")
        println("$nome_investigador corre em disparada para próxima porta com medo")
        println("A partir de agora $nome_investigador está em estado de Pânico!!!")
    } else {
        println("Você decide ficar para ver se eram os mesmos itens no armário e vasilha")
        println("E..São")
        println("Não tem muito mais o que fazer nesta sala.")
    }
    }




