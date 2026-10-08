package executavel

import game.checagem
import game.nascimento_do_Investigador
import game.sair_do_ninho
import game.explorar_ninho
import game.identificar_fantasma
import game.rep_salas
import game.tutorial_checagem


fun main() {
    val nome = nascimento_do_Investigador()

    sair_do_ninho(nome)
    explorar_ninho(nome,false, false)
    tutorial_checagem()
    rep_salas(nome)
}