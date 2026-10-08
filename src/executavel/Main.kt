package executavel

import game.nascimento_do_Investigador
import game.sair_do_ninho
import game.explorar_ninho
import game.rep_salas


fun main() {
    val nome = nascimento_do_Investigador()
    sair_do_ninho(nome)
    explorar_ninho(nome,false, false)
    rep_salas(nome)
}