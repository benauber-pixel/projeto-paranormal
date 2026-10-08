package game

fun identificar_fantasma(temperatura: Int, energia: Int) {
    println("--- DEDUZINDO O TIPO DE FANTASMA ---")

    when {
        (temperatura < 0 && energia >= 5) -> {
            println("Aviso: O ar congelou e a agulha travou no máximo!")
            println("Resultado: É um FANTASMA DO TIPO 'SPECTRO'!")
        }
        (temperatura < 0 && energia < 5) -> {
            println("Aviso: Está um frio de congelar, mas o EMF está calmo.")
            println("Resultado: É um FANTASMA DO TIPO 'ALMA PENADA'!")
        }
        (temperatura >= 0 && energia >= 5) -> {
            println("Aviso: O EMF está apitando forte, mas o ar continua normal.")
            println("Resultado: É um FANTASMA DO TIPO 'POLTERGEIST'!")
        }
        else -> {
            println("Nenhum sinal claro de fantasma nesta sala ainda...")
        }
    }
}