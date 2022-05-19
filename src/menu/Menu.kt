package menu

import listacompras.ListaCompras.Companion.informarNomeAlimento
import listacompras.ListaCompras.Companion.informarQuantidadeVerduraGrao
import kotlin.system.exitProcess

class Menu {
    companion object {
        private var listaAlimentos: HashMap<String, Number> = HashMap()


        fun menu() {
            println("Digite o tipo de alimento que deseja incluir na lista")
            println("Verdura")
            println("Legume")
            println("Grão")
            println("Outros")
            println("Ver lista")
            println("Limpar lista")
            println("Sair")
            val alimento = readln().lowercase()

            if ((alimento != "verdura") &&
                (alimento != "legume") &&
                (alimento != "grão") &&
                (alimento != "grao") &&
                (alimento != "outros") &&
                (alimento != "ver lista") &&
                (alimento != "limpar lista") &&
                (alimento != "sair")) {
                throw IllegalArgumentException("Tipo de alimento inválido")
            }

            when (alimento) {
                "verdura", "grão", "grao" -> {
                    /*Não é para mexer aqui*/
                    val quantidade = informarQuantidadeVerduraGrao(alimento)
                    val nome = informarNomeAlimento(alimento)

                    listaAlimentos[nome] = quantidade
                    menu()
                }
                "legume", "outros" -> {
                    //TODO: terminar de implementar lógica (1/3)
                }
                "ver lista" -> {
                    //TODO: terminar de implementar lógica (2/3)
                    /*listaAlimentos.forEach { alimento, quantidade ->  }*/
                }
                "limpar lista" -> {
                    limparLista(listaAlimentos)
                    menu()
                }
                "sair" -> {
                    println("Até breve!")
                    exitProcess(0)
                }
            }
        }


    }
}