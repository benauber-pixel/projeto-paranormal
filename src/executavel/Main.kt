package executavel

import introducao.nascimento_do_Investigador
import introducao.sair_do_ninho
import introducao.explorar_ninho

fun main() {
    val nome = nascimento_do_Investigador()
    sair_do_ninho(nome)
    explorar_ninho(nome,false, false)
}